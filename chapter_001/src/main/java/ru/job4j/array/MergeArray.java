package ru.job4j.array;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 28.01.2020
 * @task 1. Экзамен. Базовый синтаксис.[#207087]
 * @aim Дописать код метода merge
 * @others Массивы и алгоритмы
 */

public class MergeArray {

    public int[] merge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        for (int i = 0; i < result.length; i++) {
            if (aIndex < a.length) {
                result[i] = a[aIndex];
                aIndex++;
            } else if (bIndex < b.length) {
                result[i] = b[bIndex];
                bIndex++;
            }

        }
        return result;
    }

}