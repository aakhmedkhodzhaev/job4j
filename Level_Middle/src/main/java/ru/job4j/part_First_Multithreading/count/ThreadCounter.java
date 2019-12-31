package ru.job4j.part_First_Multithreading.count;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class ThreadCounter extends Thread{
    @GuardedBy("this")
    private int value;

    public synchronized void increment() {
        this.value++;
    }

    public synchronized int get() { // для упорядочивания нужно synchronized
        return this.value;
    }

    public void run(){
        for(int i=0; i<1000; i++){
        get();
        }
    }
}