package org.example.interview_gpt_bot.service;

import lombok.RequiredArgsConstructor;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.example.interview_gpt_bot.client.OpenAiClient;
import org.example.interview_gpt_bot.repository.InterviewRepository;
import org.example.interview_gpt_bot.repository.TopicRepository;
import org.example.interview_gpt_bot.tg.Bot;

@RequiredArgsConstructor
public abstract class Command {

    protected final TopicRepository topicRepository;
    protected final OpenAiClient openAiClient;
    protected final InterviewRepository interviewRepository;

    public abstract boolean isApplicable(Update update);

    public abstract String process(Update update, Bot bot);
}
