package ru.job4j.loop;

public class Counter {
    public static void main(String[] args) {
        System.out.println(sum(0, 5));
        System.out.println(sum(5, 7));
        System.out.println(sum(4, 10));
    }

    public static int sum(int start, int finish) {
        int rsl = 0;
        for (int i = start; i <= finish; i++) {
            rsl += i;
        }
        return rsl;
    }
}
