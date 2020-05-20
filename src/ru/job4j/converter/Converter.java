package ru.job4j.converter;

public class Converter {

    public static int rubToEur(int x) {
        int y = x / 70;
        return y;
    }

    public static int rubToUsd(int x) {
        int y = x / 60;
        return y;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubToEur(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result = " + passed);
        int inUsd = 120;
        int expectedUsd = 2;
        int outUsd = rubToUsd(inUsd);
        boolean passedUsd = expectedUsd == outUsd;
        System.out.println("120 rubles are 2 USD. Test result = " + passedUsd);
    }
}
