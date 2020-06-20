package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void turnEvenArray() {
        int[] input = {4, 6, 8, 13};
        int[] expect = {13, 8, 6, 4};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }

    @Test
    public void turnUnevenArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expect = {5, 4, 3, 2, 1};
        int[] rsl = Turn.back(input);
        assertThat(rsl, is(expect));
    }
}