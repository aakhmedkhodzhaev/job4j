package ru.job4j.converter;

/**
 * @task 3.4. Конвертер валюты.[#207052]
 * @aim Демонстрация Работы конвертации валюты
 * @version 1.0 10.12.2019
 * @author Akhmedkhodzhaev A.A.
 * @others так же есть тест
 */

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }

    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        int erub = euroToRuble(2);
        System.out.println("2 euro are " + erub + " rubles.");

        int doll = rubleToDollar(120);
        System.out.println("120 rubles are " + doll + " dollars.");

        int drub = dollarToRuble(2);
        System.out.println("2 dollars are " + drub + " rubles.");

        System.out.println("                   ");
        System.out.println("-------------------");
        System.out.println("------- Test ------");
        System.out.println("-------------------");
        System.out.println("                   ");


        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int inER = 2;
        int expectedER = 140;
        int outER = euroToRuble(inER);
        boolean passedER = expectedER == outER;
        System.out.println("2 euro are 140 rubles. Test result : " + passedER);

        int inRD = 120;
        int expectedRD = 2;
        int outRD = rubleToDollar(inRD);
        boolean passedRD = expectedRD == outRD;
        System.out.println("120 rubles are 2 dollars. Test result : " + passedRD);

        int inDR = 2;
        int expectedDR = 120;
        int outDR = dollarToRuble(inDR);
        boolean passedDR = expectedDR == outDR;
        System.out.println("2 dollars are 120 rubles. Test result : " + passedDR);

    }

}