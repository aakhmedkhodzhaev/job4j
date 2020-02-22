package ru.job4j.condition;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 23.02.2020
 * @task 4.4. Максимум из трех чисел[#207031]
 * @aim научиться использовать тернарный оператор
 * @others так же есть теста
 */

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = (((first >= second) ? first : second) >= third) ? ((first >= second) ? first : second) : third;
        return result;
    }
}