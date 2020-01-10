package ru.job4j.loop;

public class Factorial {
    public int calc(int n){
        int result=0;
        return result;
    }

    public static void main(String[]args){
      int x=0;
      for(int i=0; i<=4; i++)
      {
        if(x==0 || i==0){
          x=1;
        }
        else {
            x = x * i;
        }

      }
        System.out.println(x);

    }
}