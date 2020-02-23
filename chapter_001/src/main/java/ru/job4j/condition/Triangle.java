package ru.job4j.condition;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 23.02.2020
 * @task 4.3. А существует ли треугольник?[#207033]
 * @aim научиться использовать тернарный оператор
 * @others так же есть теста
 */

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }
}