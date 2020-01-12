package ru.job4j.loop;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 12.01.2020
 * @task 5.4. Протеиновая диета.[#207092]
 * @aim Демонстрация Работы цикла while
 * @others так же есть тест, для проверки работы программы
 */

public class Fitness {
    public int calc(int ivan, int nik) {
        int month = 0;
        while (ivan < nik) {
            ivan *= 3;
            nik *= 2;
            month++;

        }
        return month;
    }

}