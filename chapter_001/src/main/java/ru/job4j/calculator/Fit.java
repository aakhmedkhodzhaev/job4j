package ru.job4j.calculator;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 10.12.2019
 * @task 3.5. Идеальный вес.[#207053]
 * @aim Демонстрация Работы вычисления идеального веса
 * @others так же есть тест
 */

public class Fit {

    public static double manWeight(double height) {
        return (height - 100) * 1.15;
    }


    public static double womanWeight(double height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        double man = manWeight(180);
        System.out.println("Man 180 is " + man);

        double woman = womanWeight(170);
        System.out.println("Woman 170 is " + woman);

    }

}