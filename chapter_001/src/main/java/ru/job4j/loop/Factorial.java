package ru.job4j.loop;

/**
 * @task 5.2. Создать программу, вычисляющую факториал.[#207098]
 * @aim Демонстрация Работы цикла for и возврат значения result
 * @version 1.0 10.01.2020
 * @author Akhmedkhodzhaev A.A.
 * @others так же есть тест, для проверки работы программы
 */

public class Factorial {
    public int calc(int n){
        int result=1;
        for(int i=1; i<=n; i++)
        {
            result = result * i;

        }
        return result;
    }
}