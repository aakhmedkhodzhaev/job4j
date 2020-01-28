package ru.job4j.array;

/**
 * @task 6.1. Классический поиск перебором.[#207036]
 * @aim поиск данных
 * @version 1.0 28.01.2020
 * @author Akhmedkhodzhaev A.A.
 * @others существует Тест методы
 */

public class FindLoop {
  public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index=0; index<data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }


/*    public static void main(String[] args){
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        int el = 2;
        int [] data = new int[5];
        data[0]=1;
        data[1]=5;
        data[2]=6;
        data[3]=0;
        data[4]=7;

        for (int index=0; index<data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }

        }

        System.out.println(rst);

      //  return rst;
    }*/

}