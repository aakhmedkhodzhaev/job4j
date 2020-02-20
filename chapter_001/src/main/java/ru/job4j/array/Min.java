package ru.job4j.array;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 29.01.2020
 * @task 6.5.1. Поиск минимального числа в массиве.[#207045]
 * @aim нужно найти минимальное число в массиве
 * @others Имеется Тест для проверки работы программы
 */

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}