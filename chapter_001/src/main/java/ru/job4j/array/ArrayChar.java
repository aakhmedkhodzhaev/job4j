package ru.job4j.array;

/**
 * @author Akhmedkhodzhaev A.A.
 * @version 1.0 29.01.2020
 * @task 6.4. Слово начинается с ...[#207038]
 * @aim проверить право писание T9
 * @others Имеется Тест для проверки работы программы
 */

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int sizeP = pref.length;
        for (int i = 0; i < sizeP; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}