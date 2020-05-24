package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        boolean result = Triangle.exist(3, 4, 5);
        assertThat(result, is(true));
    }

    @Test
    public void whenDoesNotExist() {
        boolean result = Triangle.exist(3, 4, 7);
        assertThat(result, is(false));
    }
}