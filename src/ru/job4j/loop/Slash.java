package ru.job4j.loop;

public class Slash {
    public static void draw(int size) {
        for (int x = 1; x <= size; x++) {
            for (int y = 1; y <= size; y++) {
                boolean firstSlash = x == y;
                boolean secondSlash = (x + y) == (size + 1);
                if (firstSlash) {
                    System.out.print("X");
                } else if (secondSlash) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Draw by 3");
        Slash.draw(3);
        System.out.println("Draw by 5");
        Slash.draw(5);
        System.out.println("Draw by 8");
        Slash.draw(8);
    }
}
