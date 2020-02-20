package ru.job4j.array;

/**
 * @task 6.8. Дефрагментация массива.[#207047]
 * @aim  Дефрагментация массива
 * @version 1.0 20.02.2020
 * @author Akhmedkhodzhaev A.A.
 * @others Имеется Тест для проверки работы программы
 */

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                while(point< array.length){
                    if(array[point]==null){
                      point++;
                      continue;
                    }
                    if(array[point]!=null){
                        String temp  = array[index];
                        array[index] = array[point];
                        array[point] = temp;
                        break;
                    }
                    point++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}