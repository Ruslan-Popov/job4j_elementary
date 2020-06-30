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
    public void whenArrayNotHas8ThenMinus1() {
        FindLoop find = new FindLoop();
        int[] arr = new int[]{3, 4, 15};
        int rst = find.indexOf(arr, 8);
        assertThat(rst, is(-1));
    }

    @Test
    public void whenFind3() {
        int[] arr = {10, 4, 3, 8, 7};
        int el = 8;
        int start = 2;
        int finish = 4;
        int rst = FindLoop.indexOf(arr, el, start, finish);
        assertThat(rst, is(3));
    }

    @Test
    public void whenFind2() {
        int[] arr = {18, 5, 2, 0, 8};
        int el = 8;
        int start = 1;
        int finish = 2;
        int rst = FindLoop.indexOf(arr, el, start, finish);
        assertThat(rst, is(-1));
    }
}