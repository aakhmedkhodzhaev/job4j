package ru.job4j.array;

/**
 * @task 6.2. Перевернуть массив.[#207050]
 * @aim Сортировка по возрастанию
 * @version 1.0 28.01.2020
 * @author Akhmedkhodzhaev A.A.
 * @others Массивы и алгоритмы
 */

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        for (int i=0; i<array.length; i++) {
               for(int j=0; j<array.length-1; j++){ // метод пузырьком
                if(array[j]>array[j+1]){
                   int temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
                }
            }
       }
        for(int i=0; i<array.length; i++){
        System.out.println(array[i]);
       }
    }
}

          /*int min = array[i];     // методом выбора
            int min_i = i;
            for(int j=i+1; j<array.length; j++){
                if(array[j]<min){
                    min = array[j];
                    min_i = j;
                }
            }
            if(i!=min_i){
                int tmp = array[i];
                array[i]=array[min_i];
                array[min_i]=tmp;
            }*/