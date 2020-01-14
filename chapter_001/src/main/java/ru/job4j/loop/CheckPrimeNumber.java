package ru.job4j.loop;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 12.01.2020
 * @task 5.5. Простое число.[#207095]
 * @aim Демонстрация Работы цикла for и проверка числа простое или составное
 * @others так же есть тест, для проверки работы программы
 */

public class CheckPrimeNumber {
    public static boolean check(int finish){
        boolean prime=finish>1;
        for(int i = 2; i<finish; i++){
            if((finish%i)==0){
                prime=false;
                break;
            }
        }
        return prime;
    }

}