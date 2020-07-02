package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void whenSize2() {
        int[][] input = Matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(input, is(expect));
    }

    @Test
    public void whenSize3() {
        int[][] input = Matrix.multiple(3);
        int[][] expect = new int[][] {
            {1, 2, 3},
            {2, 4, 6},
            {3, 6, 9}
        };
        assertThat(input, is(expect));

    }
}