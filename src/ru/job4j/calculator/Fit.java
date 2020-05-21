package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double idealWeight = (height - 100) * 1.15;
        return idealWeight;
    }

    public static double womanWeight(double height) {
        double idealWeight = (height - 110) * 1.15;
        return idealWeight;
    }

    public static void main(String[] args) {
        double manHeight = 178;
        double womanHeight = 160;
        double manIdealWeight = Fit.manWeight(manHeight);
        double womanIdealWeight = Fit.womanWeight(womanHeight);
        System.out.println("With the man's height of " + manHeight + "cm his ideal weight is " + manIdealWeight + " kilos");
        System.out.println("With the woman's height of " + womanHeight + "cm her ideal weight is " + womanIdealWeight + " kilos");
    }
}
