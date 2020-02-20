package ru.job4j.loop;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 12.01.2020
 * @task 5.6. Простые числа.[#207093]
 * @aim Демонстрация Работы цикла for и показать количество простых чисел в диапазоне
 * @others так же есть тест, для проверки работы программы
 */

public class PrimeNumber {

    public int calc(int finish) {
        int count = 0;
        for (int number = 2; number <= finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count++;
            }
        }
        return count;
    }
}