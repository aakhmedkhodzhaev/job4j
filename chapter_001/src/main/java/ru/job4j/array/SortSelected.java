package ru.job4j.array;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 16.02.2020
 * @task 6.5.3. Сортировка выборкой.[#207044]
 * @aim Сортировка элементов массива
 * @others Имеется Тест для проверки работы программы
 */

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoopIndex.indexOf(data, min, i, data.length);
            if (data[index] < data[i]) {
                int tmp = data[index];
                data[index] = data[i];
                data[i] = tmp;
            }
        }
        return data;
    }
}