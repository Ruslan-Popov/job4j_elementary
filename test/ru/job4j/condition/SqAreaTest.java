package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2ThenSquare2() {
        int inP = 6;
        int inK = 2;
        double expected = 2;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K3ThenSquare3() {
        int inP = 10;
        int inK = 3;
        double expected = 3;
        double out = SqArea.square(inP, inK);
        Assert.assertEquals(expected, out, 0.01);
    }
}