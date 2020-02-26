package ru.job4j.array;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;


public class MergeArrayTest {

    @Test
    public void sizeAlongerB() {
        MergeArray mergeArray = new MergeArray();
        int[] a = {1, 2, 3};
        int[] b = {4, 5};
        int[] expect = {1, 2, 3, 4, 5};
        int[] result = mergeArray.merge(a, b);
        Assert.assertThat(result, Is.is(expect));
    }

    @Test
    public void sizeAshortB() {
        MergeArray mergeArray = new MergeArray();
        int[] a = {10, 20, 30};
        int[] b = {15, 25, 35, 45};
        int[] expect = {10, 20, 30, 15, 25, 35, 45};
        int[] result = mergeArray.merge(a, b);
        Assert.assertThat(result, Is.is(expect));
    }

    @Test
    public void sizeAdrawB() {
        MergeArray mergeArray = new MergeArray();
        int[] a = {100, 200, 300};
        int[] b = {25, 35, 45};
        int[] expect = {100, 200, 300, 25, 35, 45};
        int[] result = mergeArray.merge(a, b);
        Assert.assertThat(result, Is.is(expect));
    }
}