package ru.job4j.array;

import ru.job4j.SortSelected;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        for (int i = 0; i < rsl.length; i++) {
            if (i < left.length) {
                rsl[i] = left[i];
            } else {
                rsl[i] = right[i - left.length];
            }
        }
        SortSelected.sort(rsl);
        return rsl;
    }
}

