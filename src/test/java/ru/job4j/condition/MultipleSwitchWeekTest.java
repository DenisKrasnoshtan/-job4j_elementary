package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleSwitchWeekTest {

    @Test
    public void numberOfDayMondayThan1() {
        String in = "Monday";
        int result = MultipleSwitchWeek.numberOfDay(in);
        int expected = 1;
        Assert.assertEquals(result, expected);

    }
}