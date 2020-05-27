package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 1; row <= height; row++) {
            for (int cell = 1; cell <= width; cell++) {
                if ((row + cell) % 2 == 1) {
                    System.out.print(" ");
                }
                if ((row + cell) % 2 == 0) {
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}