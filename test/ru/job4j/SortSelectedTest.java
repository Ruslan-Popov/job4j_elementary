package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void when3() {
        assertThat(SortSelected.sort(new int[]{8, 11, 1}), is(new int[]{1, 8, 11}));
    }

    @Test
    public void when5() {
        int[] data = {2, 14, 11, 1, -13};
        int[] rst = SortSelected.sort(data);
        int[] expected = {-13, 1, 2, 11, 14};
        assertThat(rst, is(expected));
    }
}