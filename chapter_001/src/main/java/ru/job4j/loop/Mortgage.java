package ru.job4j.loop;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 13.01.2020
 * @task 5.7. Ипотека.[#207094]
 * @aim Демонстрация Работы цикла while и расчёт ипотечного кредита
 * @others так же есть тест, для проверки работы программы
 */

public class Mortgage {
    public int year(int amount, int salary, double perecent){
        int year =0;
        double rz=(1 + perecent/100)*amount - salary;
        while(rz>0){
            rz = rz*(1 + perecent/100) - salary;
            year++;
        }
        if(rz<0){
            year=1+year;
        }
        return year;
    }

}