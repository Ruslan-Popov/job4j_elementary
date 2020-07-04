package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixCheckTest {
    @Test
    public void whenAllXInRow() {
        char[][] input = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        boolean rst = MatrixCheck.monoHorizontal(input, 1);
        assertThat(rst, is(true));
    }

    @Test
    public void whenNotAllXInRow() {
        char[][] input = {
                {'X', 'X', 'x', 'X'},
                {' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' '}
        };
        boolean rst = MatrixCheck.monoHorizontal(input, 0);
        assertThat(rst, is(false));
    }

    @Test
    public void whenAllXInColumn() {
        char[][] input = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'}
        };
        boolean rst = MatrixCheck.monoVertical(input, 2);
        assertThat(rst, is(true));
    }

    @Test
    public void whenNotAllXInColumn() {
        char[][] input = {
                {' ', 'X', ' '},
                {' ', 'x', ' '},
                {' ', 'X', ' '}
        };
        boolean rst = MatrixCheck.monoVertical(input, 1);
        assertThat(rst, is(false));
    }

    @Test
    public void whenDiag3() {
        char[][] board = {
                {'a', 'b', 'c'},
                {'b', 'a', 'c'},
                {'b', 'c', 'a'}
        };
        char[] expect = {'a', 'a', 'a'};
        char[] rst = MatrixCheck.extractDiagonal(board);
        assertThat(rst, is(expect));
    }

    @Test
    public void whenWinHorizontal() {
        char[][] board = {
                {' ', ' ', ' ', ' ', 'X'},
                {' ', 'X', ' ', ' ', 'X'},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', 'X'}
        };
        boolean rst = MatrixCheck.isWin(board);
        assertThat(rst, is(true));
    }

    @Test
    public void whenWinVertical() {
        char[][] board = {
                {' ', 'X', ' ', ' ', 'X'},
                {' ', 'X', ' ', ' ', 'X'},
                {'X', 'X', ' ', 'X', 'X'},
                {' ', 'X', ' ', ' ', ' '},
                {' ', 'X', ' ', ' ', 'X'}
        };
        boolean result = MatrixCheck.isWin(board);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotWin() {
        char[][] board = {
                {' ', 'X', ' ', ' ', 'X'},
                {' ', ' ', ' ', ' ', ' '},
                {'X', ' ', ' ', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', 'X'}
        };
        boolean result = MatrixCheck.isWin(board);
        assertThat(result, is(false));
    }
}