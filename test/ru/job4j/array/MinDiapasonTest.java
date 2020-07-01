package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinDiapasonTest {
    @Test
    public void whenFirstMin() {
        assertThat(MinDiapason.findMin(new int[]{-3, 10, 15, 11}, 1, 3), is(10));
    }

    @Test
    public void whenSecondMin() {
        assertThat(MinDiapason.findMin(new int[] {2, 11, 10, 33, 68}, 1, 4), is(10));
    }

    @Test
    public void whenLastMin() {
        int[] arr = {9, 12, 1, 5, 4, 3};
        int rst = MinDiapason.findMin(arr, 3, 5);
        assertThat(rst, is(3));
    }
}