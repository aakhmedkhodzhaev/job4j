package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void rubleToEuro(){
        int in = 140;
        int excpect = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(excpect, out);
    }

    @Test
    public void rubleToDollar(){
        int in = 180;
        int excpect = 3;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(excpect, out);
    }

    @Test
    public void euroToRuble(){
        int in = 2;
        int excpect = 140;
        int out = Converter.euroToRuble(in);
        Assert.assertEquals(excpect, out);
    }

    @Test
    public void dollarToRuble(){
        int in = 3;
        int excpect = 180;
        int out = Converter.dollarToRuble(in);
        Assert.assertEquals(excpect, out);
    }
}