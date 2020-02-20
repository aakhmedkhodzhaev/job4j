package ru.job4j.array;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 28.01.2020
 * @task 6.2. Перевернуть массив.[#207050]
 * @aim Сортировка массива по возрастанию
 * @others Массивы и алгоритмы
 */

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp = array[0]; // переменная для временного хранения значение ячейки с индексом 0.
        array[0] = array[3]; // записываем в ячейку с индексом 0 значение ячейки с индексом 3.
        array[3] = temp; // записываем в ячейку с индексом 3 значение временной переменной.
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;
        temp = array[3];
        array[3] = array[4];
        array[4] = temp;
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}



        /*   for (int i=0; i<array.length; i++) {
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
       }*/

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