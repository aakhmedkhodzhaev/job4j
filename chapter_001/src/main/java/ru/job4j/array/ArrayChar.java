package ru.job4j.array;

/**
 * @task 6.4. Слово начинается с ...[#207038]
 * @aim проверить право писание T9
 * @version 1.0 29.01.2020
 * @author Akhmedkhodzhaev A.A.
 * @others Имеется Тест для проверки работы программы
 */

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
//      int sizeW=word.length;
        int sizeP=pref.length;
//      int size = sizeW>sizeP? sizeP: sizeW;
        for(int i=0; i<sizeP; i++){
            if(word[i]!=pref[i]){
                result=false;
                break;
            }
       }
        return result;
    }
}