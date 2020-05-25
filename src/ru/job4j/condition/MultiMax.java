package ru.job4j.condition;

public class MultiMax {
    public static int max(int a, int b, int c) {
        boolean abMax = a > b;
        int abResult = abMax ? a : b;
        boolean cMax = c > abResult;
        int result = cMax ? c : abResult;
        return result;
    }
}
