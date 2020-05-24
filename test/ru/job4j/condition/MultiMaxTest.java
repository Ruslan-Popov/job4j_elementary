package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenAMax() {
        int result = MultiMax.max(7, 2, 5);
        assertThat(result, is(7));
    }

    @Test
    public void whenBMax() {
        int result = MultiMax.max(3, 9, 8);
        assertThat(result, is(9));
    }

    @Test
    public void whenCMax() {
        int result = MultiMax.max(4, 8, 99);
        assertThat(result, is(99));
    }

    @Test
    public void whenEqual() {
        int result = MultiMax.max(4, 4, 4);
        assertThat(result, is(4));
    }
}