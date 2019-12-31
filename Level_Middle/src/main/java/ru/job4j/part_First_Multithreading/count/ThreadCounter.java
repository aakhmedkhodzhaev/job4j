package ru.job4j.part_First_Multithreading.count;

import net.jcip.annotations.GuardedBy;
import net.jcip.annotations.ThreadSafe;

@ThreadSafe
public class ThreadCounter{
    @GuardedBy("this")
    private int value;

    public synchronized void increment() {
        this.value++;
    }

    public int get() { // public synchronized int get() // для упорядочания нужно воспользоваться synchronized
        return this.value;
    }
}