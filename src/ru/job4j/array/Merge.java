package ru.job4j.array;

import ru.job4j.SortSelected;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int l = 0;
        int r = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (l > left.length - 1) {
                rsl[i] = right[r];
                r++;
            } else if (r > right.length - 1) {
                rsl[i] = left[l];
                l++;
            } else if (left[l] < right[r]) {
                rsl[i] = left[l];
                l++;
            } else {
                rsl[i] = right[r];
                r++;
            }
        }
        return rsl;
    }
}

