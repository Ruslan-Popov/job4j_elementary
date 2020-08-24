package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class MergeTest {

    @Test
    public void whenBothEmpty() {
        int[] expected = new int[0];
        int[] result = Merge.merge(
                new int[0],
                new int[0]
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenReOrder() {
        int[] expected = new int[] {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[] {1, 3},
                new int[] {2, 4}
        );
        assertThat(result, is(expected));
    }

    @Test
    public void whenAscOrder() {
        int[] expect = {1, 2, 3, 4};
        int[] result = Merge.merge(
                new int[] {1, 2},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftLess() {
        int[] expect = {1, 2, 3, 3, 4};
        int[] result = Merge.merge(
                new int[] {1, 2, 3},
                new int[] {3, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftGreat() {
        int[] expect = {1, 2, 3, 4, 4};
        int[] result = Merge.merge(
                new int[] {1, 2},
                new int[] {3, 4, 4}
        );
        assertThat(result, is(expect));
    }

    @Test
    public void whenLeftEmpty() {
        int[] result = {1, 2, 3, 4};
        int[] expect = Merge.merge(
                new int[] {},
                new int[] {1, 2, 3, 4}
        );
        assertThat(result, is(expect));
    }
}