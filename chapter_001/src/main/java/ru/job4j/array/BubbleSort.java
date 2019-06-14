package ru.job4j.array;

/**
 * BubbleSort.
 * Класс для сортировки массива методом перестановки.
 *
 * @author Lex Gnatovsky (a.gnatovsky@mail.ru)
 * @since 14.06.2019;
 */
public class BubbleSort {
    /**
     * Method sort.
     * Метод сортирует массив по возрастанию.
     *
     * @param arr - массив.
     * @return отсортированный массив.
     */
    public int[] sort(int[] arr) {
        for (int j = 1; j <= arr.length; j++) {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    int val = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = val;
                }
            }
        }
        return arr;
    }
}