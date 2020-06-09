package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, int percent) {
        int qty = 0;
        while (amount > 0) {
            amount = amount - salary + amount * percent / 100;
            qty++;
        }
        return qty;
    }
}
