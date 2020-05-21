package ru.job4j.calculator;

import org.junit.Test;

import org.junit.Assert;

public class FitTest {

    @Test
    public void whenManHeight200CmThen115() {
        double in = 200;
        double expected = 115;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWomanHeight210CmThen115() {
        double in = 210;
        double expected = 115;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}