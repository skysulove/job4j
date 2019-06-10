package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest2 {
    @Test
    public void whenEndWithPrefixThenTrue() {
        ArrayChar2 word = new ArrayChar2();
        boolean result = word.endsWith("Hello", "lo");
        assertThat(result, is(true));
    }
    @Test
    public void whenNotEndWithPrefixThenFalse() {
        ArrayChar2 word = new ArrayChar2("Hello");
        boolean result = word.endsWith("Hello", "la");
        assertThat(result, is(false));
    }
}