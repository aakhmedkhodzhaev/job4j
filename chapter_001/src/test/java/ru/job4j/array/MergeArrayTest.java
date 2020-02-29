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
        int[] expect = {10, 15, 20, 25, 30, 35, 45};
        int[] result = mergeArray.merge(a, b);
        Assert.assertThat(result, Is.is(expect));
    }

    @Test
    public void sizeAdrawB() {
        MergeArray mergeArray = new MergeArray();
        int[] a = {10, 20, 30};
        int[] b = {25, 35, 45};
        int[] expect = {10, 20, 25, 30, 35, 45};
        int[] result = mergeArray.merge(a, b);
        Assert.assertThat(result, Is.is(expect));
    }

    @Test
    public void sizeBdrawA() {
        MergeArray mergeArray = new MergeArray();
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        int[] expect = {1, 2, 3, 4, 5, 6};
        int[] result = mergeArray.merge(a, b);
        Assert.assertThat(result, Is.is(expect));
    }

    @Test
    public void sizeBlongerA() {
        MergeArray mergeArray = new MergeArray();
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6, 7, 8, 9, 10, 11};
        int[] expect = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int[] result = mergeArray.merge(a, b);
        Assert.assertThat(result, Is.is(expect));
    }

    @Test
    public void sizeBshortA() {
        MergeArray mergeArray = new MergeArray();
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110};
        int[] b = {15, 25, 35, 45};
        int[] expect = {10, 15, 20, 25, 30, 35, 40, 45, 50, 60, 70, 80, 90, 100, 110};
        int[] result = mergeArray.merge(a, b);
        Assert.assertThat(result, Is.is(expect));
    }

}