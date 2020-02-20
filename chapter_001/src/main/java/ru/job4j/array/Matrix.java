package ru.job4j.array;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 17.02.2020
 * @task 6.6. Двухмерный массив. Таблица умножения.[#207037]
 * @aim Создание таблицы умножения
 * @others Имеется Тест для проверки работы программы
 */

public class Matrix {
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            int k = i + 1;
            for (int j = 0; j < size; j++) {
                int z = j + 1;
                table[i][j] = k * z;
            }

        }

        return table;
    }

}