package ru.job4j.array;

import  org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class EndsWithTest {
    @Test
    public void whenEndWithPostfixThenTrue() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'l', 'o'};
        boolean rst = EndsWith.endsWith(word, post);
        assertThat(rst, is(true));
    }

    @Test
    public void whenNotEndWithPostfixThenFalse() {
        char[] word = {'H', 'e', 'l', 'l', 'o'};
        char[] post = {'y', 'o'};
        boolean rst = EndsWith.endsWith(word, post);
        assertThat(rst, is(false));
    }
}