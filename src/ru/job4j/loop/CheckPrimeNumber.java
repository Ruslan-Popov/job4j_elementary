package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean isPrime = true;
        if (number == 1) {
            isPrime = false;
        }
        int prime = 2;
        for (int i = 1; i < (number - 1); i++) {
            if (number % prime == 0) {
                isPrime = false;
                break;
            }
            prime++;
        }
        return isPrime;
    }
}
