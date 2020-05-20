package ru.job4j.converter;

public class Converter {

    public static double rubToEur(double x) {
        double y = x / 70;
        return y;
    }

    public static double rubToUsd(double x) {
        double y = x / 60;
        return y;
    }

    public static void main(String[] args) {
        double rubSum = 130.52;
        double resRubToEur = Converter.rubToEur(rubSum);
        double resRubToUsd = Converter.rubToUsd(rubSum);
        System.out.println(rubSum + " rubles are " + resRubToEur + " euro");
        System.out.println(rubSum + " rubles are " + resRubToUsd + " US dollars");
    }
}
