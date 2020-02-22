package ru.job4j.condition;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 23.02.2020
 * @task 4.1. Глупый бот.[#207026]
 * @aim Операторы ветвлений
 * @others так же возможно написание теста
 */

public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
}