package ru.job4j.condition;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 23.02.2020
 * @task 4.0. Операторы ветвлений [#207032]
 * @aim Операторы ветвлений
 * @others так же возможно написание теста
 */

public class AlertDivByZero {
    public static void main(String[] args) {
        possibleDiv(-4);
        possibleDiv(0);
    }

    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("Could not div by 0.");
        }
        else if(number<0){
            System.out.println("This is negative numbers");
        }
    }
}