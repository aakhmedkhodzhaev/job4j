package ru.job4j.loop;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 14.01.2020
 * @task 5.9. Крест в псевдографике. [#207096]
 * @aim Нарисовать крест на консоле
 * @others кретик нарисованный ноликом
 */

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = row == cell; //  (size+row+cell)%2!=0 можно и так при условии что число(не размер) бывает отрицательным
                boolean right = size - 1 == cell + row; // (size+row+cell)%2!=0 можно и так при условии что число(не размер) бывает отрицательным
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
    }
}