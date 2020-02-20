package ru.job4j.array;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 30.01.2020
 * @task 6.5.2. Поиск минимума в диапазоне.[#207046]
 * @aim нужно найти минимальное число в массиве в диапазоне индексов
 * @others Имеется Тест для проверки работы программы
 */

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}