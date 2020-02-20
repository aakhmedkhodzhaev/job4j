package ru.job4j.loop;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 10.01.2020
 * @task 5.3. Построить шахматную доску в псевдографике.[#207101]
 * @aim Демонстрация Работы цикла for и в результате получения доски с разными параметрами
 * @others 2х2, 3х3...10х10
 */

public class Board {
    public static void paint(int width, int height) {
        for (int cell = 0; cell < width; cell++) { // условие проверки, что писать пробел или X
            for (int row = 0; row < height; row++) { // Выше в задании мы определили закономерность, когда нужно проставлять X

                if ((cell + row) % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            // добавляем перевод на новую строку.
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}