package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayLength3() {
        int[] data = new int[] {3, 2, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayLength5() {
        int[] data = new int[] {123, 321, 222, 44442, 8943};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {123, 222, 321, 8943, 44442};
        Assert.assertArrayEquals(expected, result);
    }
}