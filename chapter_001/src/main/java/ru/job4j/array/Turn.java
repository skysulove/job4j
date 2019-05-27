package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        int tmp;
        for (int index = 0; index <array.length/2; index ++) {
            tmp = array[array.length - 1 - index];
            array[array.length - 1 - index] = array[index];
            array[index] = tmp;
        }
        return array;
    }
}