package ru.job4j.condition;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 23.02.2020
 * @task 4.2. Максимум из двух чисел[#207030]
 * @aim научиться использовать тернарный оператор
 * @others так же есть теста
 */

public class Max {
    public static int max(int left, int right) {
        int result = (left >= right) ? left : right;
        return result;
    }

}