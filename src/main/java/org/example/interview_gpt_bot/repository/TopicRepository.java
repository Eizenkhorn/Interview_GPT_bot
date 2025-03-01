package org.example.interview_gpt_bot.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

    @Repository
    public class TopicRepository {
        private final List<String> topics = List.of(
                // Объектно-Ориентированное Программирование (ООП)
                "Что такое объектно-ориентированное программирование и его основные принципы?",
                "В чем заключается разница между наследованием и композицией?",
                "Как реализуется полиморфизм в Java и какие его преимущества?",
                "Когда следует использовать абстрактный класс, а когда интерфейс?",
                "Какие методы класса Object являются ключевыми для реализации ООП?",
                "Что такое переопределение метода и чем оно отличается от перегрузки?",
                "Как реализовать паттерн Singleton и какие могут быть его недостатки?",
                "Как принцип инкапсуляции помогает защитить данные внутри класса?",
                "Как абстракция позволяет скрыть сложность реализации?",
                "Какие принципы SOLID вы знаете и как они применяются в Java?",

                // Класс Object и его методы
                "В чем заключается контракт между методами equals() и hashCode()?",
                "Почему важно переопределять метод toString() в классе Object?",
                "Как работает метод clone() и какие проблемы могут возникнуть при его использовании?",
                "Что делает метод finalize() и почему его использование считается нежелательным?",
                "Чем отличается сравнение объектов с помощью оператора == и метода equals()?",
                "Почему все классы в Java наследуют методы от класса Object?",
                "В каких случаях имеет смысл переопределять метод clone()?",
                "Как проверить, принадлежит ли объект определенному классу, используя возможности класса Object?",
                "Какие особенности следует учитывать при переопределении методов Object в контексте потокобезопасности?",
                "Как методы Object могут быть полезны при отладке и логировании?",

                // Исключения
                "Чем отличаются проверяемые (checked) исключения от непроверяемых (unchecked)?",
                "Как правильно использовать конструкцию try-catch-finally?",
                "Что произойдет, если исключение не будет перехвачено в блоке try?",
                "Когда стоит применять try-with-resources и как он работает?",
                "Как создать собственное исключение, расширив класс Exception или RuntimeException?",
                "Чем отличается ключевое слово throw от ключевого слова throws?",
                "Как работает механизм цепочки исключений (exception chaining) и зачем он нужен?",
                "В каком порядке выполняются блоки try, catch и finally?",
                "Какие принципы следует соблюдать при обработке исключений в приложении?",
                "Как исключения способствуют повышению надежности Java-приложения?",

                // Коллекции, особенно HashMap
                "Как устроен HashMap и каким образом он обрабатывает коллизии хешей?",
                "Что такое хеш-функция и как она влияет на производительность HashMap?",
                "Какую роль играет load factor в работе HashMap и когда происходит его перераспределение?",
                "Что происходит при добавлении элемента с уже существующим ключом в HashMap?",
                "Чем HashMap отличается от Hashtable по функционалу и потокобезопасности?",
                "Какие способы итерации по элементам HashMap вы знаете и в чем их преимущества?",
                "Какие методы HashMap позволяют эффективно искать элементы по ключу?",
                "Что такое fail-fast итераторы и как они работают в коллекциях Java?",
                "Какие проблемы могут возникнуть при использовании HashMap в многопоточной среде?",
                "Как реализовать потокобезопасное использование коллекций, аналогичное HashMap?",

                // Многопоточность
                "Как создать новый поток в Java, реализовав интерфейс Runnable?",
                "Чем отличается вызов метода start() у потока от вызова run() напрямую?",
                "Как синхронизировать доступ к разделяемым ресурсам с помощью ключевого слова synchronized?",
                "Что такое блокировка (lock) и как она помогает избежать состояния гонки?",
                "Как работают методы wait(), notify() и notifyAll() в многопоточном коде?",
                "Для чего используется ключевое слово volatile и когда его необходимо применять?",
                "Какие проблемы могут возникнуть при одновременном доступе нескольких потоков к коллекциям?",
                "Чем отличается метод sleep() от метода yield() в многопоточном программировании?",
                "Что такое deadlock и как можно его предотвратить в Java?",
                "Как использовать конструкцию try-catch-finally для управления ресурсами в многопоточной среде?"
        );
    }


