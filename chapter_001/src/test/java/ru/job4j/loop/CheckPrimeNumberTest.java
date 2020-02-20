package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CheckPrimeNumberTest {
    @Test
    public void when5() {
        CheckPrimeNumber cn = new CheckPrimeNumber();
        boolean rsl = cn.check(5);
        assertThat(rsl, is(true));
    }

    @Test
    public void when4() {
        CheckPrimeNumber cn = new CheckPrimeNumber();
        boolean rsl = cn.check(4);
        assertThat(rsl, is(false));
    }

}