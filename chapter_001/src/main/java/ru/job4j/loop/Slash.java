package ru.job4j.loop;

/**
 * @task 5.9. Крест в псевдографике. [#207096]
 * @aim Демонстрация Работы вычисления идеального веса
 * @version 1.0 13.01.2020
 * @author Akhmedkhodzhaev A.A.
 * @others так же есть тест
 */

public class Slash {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = true; // добавить условие, по которому нужно определить ставить ли символ или нет.
                boolean right = true; // добавить условие, что нужно ставить элемент в правый угол.
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