package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSortArrayOf5Elements() {
        int[] data = new int[]{1, 2, 3, 4, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[]{1, 2, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3};
        Assert.assertArrayEquals(expected, result);
    }
}