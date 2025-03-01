package org.example.interview_gpt_bot.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.example.interview_gpt_bot.dto.GptRequest;
import org.example.interview_gpt_bot.dto.GptResponse;



import java.util.List;

@Component
@RequiredArgsConstructor
public class OpenAiClient {

    @Value("${openai.api.key}")
    private String apiKey;

    @Value("${openai.api.chat.url}")
    private String chatApiUrl;

    @Value("${openai.api.chat.model}")
    private String chatModel;

    @Value("${openai.api.chat.system_role}")
    private String systemRole;

    private final RestTemplate restTemplate;
    private final ObjectMapper objectMapper;

    public String promptModel(String prompt) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(apiKey);

        GptRequest body = GptRequest.builder()
                .model(chatModel)
                .messages(List.of(
                        GptRequest.Message.builder()
                                .role("system")
                                .content(systemRole)
                                .build(),
                        GptRequest.Message.builder()
                                .role("user")
                                .content(prompt)
                                .build()
                ))
                .build();

        HttpEntity<GptRequest> request = new HttpEntity<>(body, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(chatApiUrl, request, String.class);
        GptResponse responseBody;
        try {
            responseBody = objectMapper.readValue(response.getBody(), GptResponse.class);
        } catch (JsonProcessingException e) {
            throw new IllegalStateException("There's an error when parsing JSON response from GPT", e);
        }
        return responseBody.getChoices().get(0).getMessage().getContent();
    }
}