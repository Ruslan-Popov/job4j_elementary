package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int nullIndex = i; // указатель на null ячейку
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] != null) {
                        int notNullIndex = j;
                        SwitchArray.swap(array, nullIndex, notNullIndex);
                        break;
                    }
                }
            }
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int i = 0; i < compressed.length; i++) {
            System.out.print(compressed[i] + " ");
        }
    }
}
