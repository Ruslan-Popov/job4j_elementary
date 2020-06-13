package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] arr = new int[] {5, 6, 23};
        int rst = find.indexOf(arr, 5);
        assertThat(rst, is(0));
    }

    @Test
    public void whetArrayNotHas8ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] arr = new int[]{3, 4, 15};
        int rst = find.indexOf(arr, 8);
        assertThat(rst, is(-1));
    }
}