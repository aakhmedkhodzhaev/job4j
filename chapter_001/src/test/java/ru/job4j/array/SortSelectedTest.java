package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] excpect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(excpect));
    }

    @Test
    public void whenSortThreeCell() {
        int[] input = new int[]{7, 2, 25};
        int[] resutl = SortSelected.sort(input);
        int[] excpect = new int[]{2, 7, 25};
        assertThat(resutl, is(excpect));
    }

}