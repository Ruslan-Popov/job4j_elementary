package ru.job4j.array;

/**
 * сортировка массива вручную поочередной заменой мест элементов
 */
public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[]{5, 3, 2, 1, 4};
        int temp0 = array[0];
        array[0] = array[3];
        array[3] = temp0;
        int temp1 = array[1];
        array[1] = array[2];
        array[2] = temp1;
        int temp3 = array[3];
        array[3] = array[4];
        array[4] = temp3;
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}
