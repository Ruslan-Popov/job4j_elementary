package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MortgageTest {
    @Test
    public void when1Year() {
        Mortgage mortgage = new Mortgage();
        int qty = mortgage.year(1000, 1200, 1);
        assertThat(qty, is(1));
    }

    @Test
    public void when2Year() {
        Mortgage mortgage = new Mortgage();
        int qty = mortgage.year(100, 120, 50);
        assertThat(qty, is(2));
    }

    @Test
    public void when4Year() {
        Mortgage mortgage = new Mortgage();
        int qty = mortgage.year(100, 70, 50);
        assertThat(qty, is(4));
    }
}