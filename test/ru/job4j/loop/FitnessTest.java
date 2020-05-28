package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FitnessTest {

    @Test
    public void whenIvanLessByFewNik() {
        int month = Fitness.calc(30, 50);
        int expected = 2;
        assertThat(month, is(expected));
    }

    @Test
    public void whenIvanLessByOneNik() {
        int month = Fitness.calc(50, 70);
        assertThat(month, is(1));
    }

    @Test
    public void whenIvanGreatNik() {
        int month = Fitness.calc(95, 90);
        assertThat(month, is(0));
    }
}