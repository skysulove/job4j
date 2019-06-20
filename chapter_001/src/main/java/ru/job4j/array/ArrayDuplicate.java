package ru.job4j.array;

import java.util.Arrays;
/**
 *Удаление дубликатов в массиве.
 *
 *@author Lex Gnatovsky (a.gnatovsky@mail.ru).
 *@version 1.2;
 *@since 19.06.2019;
 */

public class ArrayDuplicate {
    /**
     *Удаляем дубликат из строки array.
     *@param array array с дубликатом.
     *@return array без дубликата.
     */
    public String[] remove(String[] array) {
        int a = array.length;
        for (int i=0; i < a; i++) {
            for (int j= i + 1; j < a; j++) {
                if(array[i].equals(array[j])) {
                    String tmp = array[j];
                    array[j] = array[a - 1];
                    array[a - 1] = tmp;
                    a-- ;
                    i-- ;
                }
            }
        }
        return Arrays.copyOf(array, a);
    }
}
