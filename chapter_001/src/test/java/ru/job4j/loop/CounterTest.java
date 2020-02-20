package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        Counter count = new Counter();
        int start = 0;
        int finish = 10;
        int sum = count.add(start, finish);
        assertThat(sum, is(30)); //Проврека метода counter.add при диапазоне 0..10 сумма чётных чисел будет равна 30.
    }
}