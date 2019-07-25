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

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int i = 0;

        while (i < result.length) {
            result[i] = left[leftIndex] < right[rightIndex] ? left[leftIndex++] : right[rightIndex++];
            if (leftIndex == left.length) {
                System.arraycopy(right, rightIndex, result, ++i, right.length - rightIndex);
                break;
            }
            if (rightIndex == right.length) {
                System.arraycopy(left, leftIndex, result, ++i, left.length - leftIndex);
                break;
            }
            i++;
        }
        return result;
    }
}