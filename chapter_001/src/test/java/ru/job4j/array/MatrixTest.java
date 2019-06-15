package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * MatrixTest.
 * Класс для автоматического тестирования методов класса Matrix.
 *
 * @author Lex Gnatovsky (a.gnatovsky@mail.ru)
 * @version 1.2;
 * @since 15.06.2019;
 */
public class MatrixTest {
    /**
     * Проверяет (Тестирует) матрицу таблицы умножения.
     */
    @Test
    public void when2on2() {
        Matrix matrix = new Matrix();
        int[][] table = matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expect));
    }
}