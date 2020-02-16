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
        int min = MinDiapason.findMin(data, 0, data.length-1);  // минимальное значение элемента в массиве
        int index = FindLoopIndex.indexOf(data, min, 0, data.length); // индекс элемента полученного из массива
        for (int i=0; i < data.length; i++) {
            for(int j=i;j<data.length; j++){
                if(data[j]<data[i]){
                    int tmp = data[j];
                    data[j]=data[i];
                    data[i]=tmp;
                }
            }
        }

        return data;
    }
}