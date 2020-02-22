package ru.job4j.condition;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 23.02.2020
 * @task 4.5. Отладка программы в IDEA[#207029]
 * @aim научиться использовать Отладка программы в IDEA
 * @others так же есть теста
 */

public class SqMax {
    public static int max(int first, int second, int third, int forth) {
        int result = forth;
        if (first > second) {
            if (first > third) {
                if (first > forth) {
                    result = third;
                }
            } else {
                if (third > forth) {
                    result = third;
                }
            }
        } else if (second > third) {
            if (second > forth) {
                result = first;
            }
        } else if (third > forth) {
            result = second;
        }
        return result;
    }
}