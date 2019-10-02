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
        int lIndex = 0;
        int rIndex = 0;
        int[] result = new int[left.length + right.length];
        for (int i = 0; i < result.length; i++) {
            if (rIndex >= right.length) {
                result[i] = left[lIndex];
                lIndex++;
            } else if (lIndex >= left.length) {
                result[i] = right[rIndex];
                rIndex++;
            } else if (left[lIndex] < right[rIndex]) {
                result[i] = left[lIndex];
                lIndex++;
            } else if (right[rIndex] < left[lIndex]) {
                result[i] = right[rIndex];
                rIndex++;
            }
        }
        return result;
    }
}