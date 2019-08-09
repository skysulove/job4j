package ru.job4j.test;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
/**
 * @author Lex Gnatovsky
 * @since 16.07.2019.
 * @version 1.3.
 */
public class MergerTest {

    @Test
    public void merge() {

        Merger merged = new Merger();
        int[] left = {1, 3};
        int[] right = {2, 4};
        int[] result = merged.merge(left, right);
        int[] expect = {1, 2, 3, 4};
        assertThat(result, is(expect));
    }
}
