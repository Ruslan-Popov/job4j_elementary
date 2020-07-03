package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {
    @Test
    public void whenAllX() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        boolean rst = MatrixCheck.monoHorizontal(input, 1);
        assertThat(rst, is(true));
    }

    @Test
    public void whenNotAllX() {
        char[][] input = {
                {'X', 'X', 'x', 'X'},
                {' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' '}
        };
        boolean rst = MatrixCheck.monoHorizontal(input, 0);
        assertThat(rst, is(false));
    }
}