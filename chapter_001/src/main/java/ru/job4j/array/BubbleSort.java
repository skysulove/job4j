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
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j] > arr[j+1] ){
                    int val = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = val;
                }
            }
        }
        return arr;
    }
}