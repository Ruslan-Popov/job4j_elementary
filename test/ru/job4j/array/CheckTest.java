package ru.job4j.array;


import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CheckTest {
    @Test
    public void whenDataAllFalseThenTrue() {
        boolean[] input = {false, false, false};
        boolean expected = true;
        boolean rst = Check.mono(input);
        assertThat(rst, is(expected));
    }

    @Test
    public void whenDataDiffThenFalse() {
        boolean[] input = {true, true, false};
        boolean expected = false;
        boolean rst = Check.mono(input);
        assertThat(rst, is(expected));
    }
}