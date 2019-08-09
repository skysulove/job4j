package ru.job4j.test;

/**
 * Class Merger объединяет два массива
 * @author Lex Gnatovsky
 * @since 16.07.2019.
 * @version 1.3.
 */

public class Merger {
    /**
     * Метод создает третий массив путем объединения двух отсортированных массивов.
     * @param left array.
     * @param right array.
     * @return 3-d combined array.
     */
    public int[] merge(int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int[] result = new int[left.length + right.length];
        for (int i = 0; i < result.length; i++) {
            if (rightIndex >= right.length) {
                result[i] = left[leftIndex];
                leftIndex++;
            } else if (leftIndex >= left.length) {
                result[i] = right[rightIndex];
                rightIndex++;
            } else if (left[leftIndex] < right[rightIndex]) {
                result[i] = left[leftIndex];
                leftIndex++;
            } else if (right[rightIndex] < left[leftIndex]) {
                result[i] = right[rightIndex];
                rightIndex++;
            }
        }
        return result;
    }
}