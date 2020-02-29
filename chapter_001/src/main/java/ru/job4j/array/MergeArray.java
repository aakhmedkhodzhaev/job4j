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
        int aIndex = 0, bIndex = 0;
        for (int i = 0; i < result.length; i++) {
            if (a.length == aIndex) {
                result[i] = b[bIndex];
                bIndex++;
            } else if (b.length == bIndex) {
                result[i] = a[aIndex];
                aIndex++;
            } else if (a[aIndex] > b[bIndex]) {
                result[i] = b[bIndex];
                bIndex++;
            } else if (a[aIndex] < b[bIndex]) {
                result[i] = a[aIndex];
                aIndex++;
            } else {
                result[i] = a[aIndex];
                result[i] = b[bIndex];
            }

        }
        return result;
    }

}