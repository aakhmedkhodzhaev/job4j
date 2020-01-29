package ru.job4j.array;

/**
 * @task 6.3. Массив заполнен true или false[#207039]
 * @aim проверить все элементы в массиве являются ли true или false
 * @version 1.0 29.01.2020
 * @author Akhmedkhodzhaev A.A.
 * @others Имеется Тест для проверки работы программы
 */

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i=0; i<data.length; i++) {
            if(data[i]!=data[data.length-1]){
                result=false;
                break;
            }
        }
        return result;
    }
}