package ru.job4j.calculator;

/**
 * Class Класс для вычисления арифметической операции + - * / ^.
 * @task 3.3. Элементарный калькулятор.[#207060]
 * @aim Демонстрация Работы простого калькулятора
 * @version 1.0 10.12.2019
 * @author Akhmedkhodzhaev A.A.
 * @others можно производить все действия
 */

public class Calculator {

/**
 * Сложение
 * @param first  первый аргумент
 * @param second второй аргумент
 * @return результат
 */

    public static void add(double first, double second){
        double result = first + second;
        System.out.println(first + "+" + second + " = " + result);
    }

    /**
     * Деление
     * @param first  первый аргумент
     * @param second второй аргумент
     * @return результат
     */

    public static void div(double first, double second){
        double result = second/first;
        System.out.println(second + "/" + first + " = " + result);
    }

    /**
     * Умножение
     * @param first  первый аргумент
     * @param second второй аргумент
     * @return результат
     */

    public static void multiplay(double first, double second){
        double result = first*second;
        System.out.println(first + " * " + second + " = " + result);
    }

    /**
     * Вычисление
     * @param first  первый аргумент
     * @param second второй аргумент
     * @return результат
     */

    public static void subtrack(double first, double second){
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }
    /**
     * Проверка работы калькулятора
     * @param args - args
     */

    public static void main(String[]args){
        add(1, 1);
        div(2, 4);
        multiplay(2, 1);
        subtrack(10, 5);
    }
}