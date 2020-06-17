package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, 3);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap3to5() {
        int[] input = {3, 4, 5, 6, 7, 8};
        int[] expect = {3, 4, 5, 8, 7, 6};
        int[] rst = SwitchArray.swap(input, 3, 5);
        assertThat(rst, is(expect));
    }
}