package ru.job4j.calculator;

public class Fit {
    public static short manWeight(short height) {
        short idealWeight = (short) ((height - 100) * 1.15);
        return idealWeight;
    }

    public static short womanWeight(short height) {
        short idealWeight = (short) ((height - 110) * 1.15);
        return idealWeight;
    }

    public static void main(String[] args) {
        short manHeight = 178;
        short womanHeight = 160;
        short manIdealWeight = Fit.manWeight(manHeight);
        short womanIdealWeight = Fit.womanWeight(womanHeight);
        System.out.println("With the man's height of " + manHeight + "cm his ideal weight is " + manIdealWeight + " kilos");
        System.out.println("With the woman's height of " + womanHeight + "cm her ideal weight is " + womanIdealWeight + " kilos");
    }
}
