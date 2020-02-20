package ru.job4j.array;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 27.01.2020
 * @task 6.0. Заполнить массив степенями чисел.[#207035]
 * @aim Создать программу, которая будет заполнять массив числами, возведенными в квадрат
 * @others использовать разные типы данных
 */

public class Square {

    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = i * i;
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }

}