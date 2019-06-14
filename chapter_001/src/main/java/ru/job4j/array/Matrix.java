package ru.job4j.array;
/**
 * Matrix.
 * Класс для заполнения двухмерного массива произведением индексов массива .
 *
 * @author Lex Gnatovsky (a.gnatovsky@mail.ru)
 * @since 14.06.2019;
 */
public class Matrix {
    /**
     * Method multiple.
     * Метод заполняет матрцу значениями в результате перемножения индексов ячеек.
     *
     * @param size - размер матрицы.
     * @return заполненный массив.
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++ ) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}