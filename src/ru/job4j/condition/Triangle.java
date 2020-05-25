package ru.job4j.condition;

public class Triangle {
    public static boolean exist(int ab, int bc, int ac) {
        return (ab + bc > ac) && (ab + ac > bc) && (bc + ac > ab);
    }
}
