package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int numberOne = 1;
        int numberTwo = 2;
        int result = Max.max(numberOne, numberTwo);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax4To2Then4() {
        int numberOne = 4;
        int numberTwo = 2;
        int result = Max.max(numberOne, numberTwo);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int numberOne = 5;
        int numberTwo = 5;
        int result = Max.max(numberOne, numberTwo);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To5To7Then7() {
        int numberOne = 5;
        int numberTwo = 5;
        int numberTree = 7;
        int result = Max.max(numberOne, numberTwo, numberTree);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To5To5Then5() {
        int numberOne = 5;
        int numberTwo = 5;
        int numberTree = 5;
        int result = Max.max(numberOne, numberTwo, numberTree);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2To3To4Then4() {
        int numberOne = 1;
        int numberTwo = 2;
        int numberTree = 3;
        int numberFour = 4;
        int result = Max.max(numberOne, numberTwo, numberTree, numberFour);
        int expected = 4;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To1To1To1Then1() {
        int numberOne = 1;
        int numberTwo = 1;
        int numberTree = 1;
        int numberFour = 1;
        int result = Max.max(numberOne, numberTwo, numberTree, numberFour);
        int expected = 1;
        Assert.assertEquals(result, expected);
    }
}
