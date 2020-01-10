package ru.job4j.loop;

/**
 * @task 5.1. Подсчет суммы чётных чисел в диапазоне[#207097]
 * @aim Демонстрация Работы цикла for и возврат значения sum
 * @version 1.0 10.01.2020
 * @author Akhmedkhodzhaev A.A.
 * @others так же есть тест, для проверки работы программы
 */

public class Counter {
            public int add(int start, int finish){
            int sum=0;
                for(int i=start; i<=finish; i++){
                if(i%2==0) {
                    sum += i;
                }
              }
              return sum;
            }
        }