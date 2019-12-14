package ru.job4j.calculator;

public class Calculator {

    public static void add(double first, double second){
        double result = first + second;
        System.out.println(first + "+" + second + " = " + result);
    }

    public static void div(double first, double second){
        double result = second/first;
        System.out.println(second + "/" + first + " = " + result);
    }

    public static void multiplay(double first, double second){
        double result = first*second;
        System.out.println(first + " * " + second + " = " + result);
    }

    public static void subtrack(double first, double second){
        double result = first - second;
        System.out.println(first + " - " + second + " = " + result);
    }

    public static void main(String[]args){
        add(1, 1);
        div(2, 4);
        multiplay(2, 1);
        subtrack(10, 5);
    }
}