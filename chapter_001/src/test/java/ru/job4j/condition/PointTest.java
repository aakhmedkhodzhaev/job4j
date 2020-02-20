package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        int x2 = 2;
        int x1 = 0;
        int y2 = 0;
        int y1 = 0;
        int excpect = 2;
        double out = Point.distance(x2, x1, y2, y1);
        Assert.assertEquals(excpect, out, 0.01);
    }

}