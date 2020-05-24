package ru.job4j.condition;

public class MultiMax {
    public static int max(int a, int b, int c) {
        boolean aMax = a > b && a > c;
        boolean bMax = b > a && b > c;
        int result = aMax ? a : bMax ? b : c;
        return result;
    }
}
