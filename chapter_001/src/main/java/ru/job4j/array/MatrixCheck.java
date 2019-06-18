package ru.job4j.array;
/**
 *Check matrix.
 *
 *@author Lex Gnatovsky (a.gnatovsky@mail.ru).
 *@version 1.2;
 *@since 18.06.2019;
 */

public class MatrixCheck {
    /**
     *Проверка диагоналей матрицы.
     *@param data matrix.
     *@return check.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++)  {
            if ((data[0][0] != data[i][i]) || (data[0][data.length - 1] != data[i][data.length - i - 1])) {
                result = false;
                break;
            }
        }
        return result;
    }
}