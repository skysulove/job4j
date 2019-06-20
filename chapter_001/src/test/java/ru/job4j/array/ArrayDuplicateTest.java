package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ArrayDuplicateTest {
    /**
     *Test
     *
     *@autor Lex Gnatovsky (a.gnatovsky@mail.ru).
     *@version 1.2;
     *@since 19.06.2019;
     */
    @Test
    public void remove() {
        ArrayDuplicate data = new ArrayDuplicate();
            String[] input = {"Hello", "World", "Super", "World"};
            String[] result = data.remove(input);
            String[] expect = {"Hello", "World", "Super"};
            assertThat(result, is(expect));
    }
}