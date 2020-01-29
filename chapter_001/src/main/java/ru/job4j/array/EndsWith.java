package ru.job4j.array;

/**
 * @task 6.4.1. Слово заканчивается с ...[#207042]
 * @aim проверить оканчание слово
 * @version 1.0 29.01.2020
 * @author Akhmedkhodzhaev A.A.
 * @others Имеется Тест для проверки работы программы
 */

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        int sizeW=word.length;
        int sizeP=post.length;
        int i=0;
        for(int y=sizeP-1; y>=0; y--){
            i++;
            if(sizeP==i){
                break;
            }
            if(word[sizeW-i]!=post[y]){
                result=false;
                break;
            }

            else{
                result=true;
            }

        }

        return result;
    }
}