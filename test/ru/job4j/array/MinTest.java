package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MinTest {
    @Test
    public void whenMinZero() {
        int[] arr = {3, 6, 5, 19};
        int res = Min.findMin(arr);
        assertThat(res, is(3));
    }

    @Test
    public void whenMinFifth() {
        assertThat(Min.findMin(new int[]{2, 6, 9, 10, 25, 1}), is(1));
    }
}