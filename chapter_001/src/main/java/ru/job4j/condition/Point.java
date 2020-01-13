package ru.job4j.condition;

/**
 * @task 3.6. Расстояние между точками в системе координат[#207061]
 * @aim Вычисление дистанции между точками в системе координат
 * @version 1.0 10.12.2019
 * @author Akhmedkhodzhaev A.A.
 * @others так же есть тест
 */

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

    }

    public static void main(String[] args) {
          double result = distance(0, 0, 2, 0);
          System.out.println("result (0, 0) to (2, 0) " + result);

          double resultA = distance(0, 0, 0, 1);
          System.out.println("result (1, 0) to (0, 0) " + resultA);

          double resultB = distance(4, 0, 5, 0);
          System.out.println("result (0, 0) to (5, 4) " + resultB);

          double resultC = distance(0, 0, 4, 3);
          System.out.println("result (3, 0) to (4, 0) " + resultC);

          double resultD = distance(3, 0, 9, 8);
          System.out.println("result (8, 0) to (9, 3) " + resultD);

    }

}