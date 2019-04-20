package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest  {
    @Test
    public void add()  {
        Calculator calc = new Calculator();
        double result = calc.add(7, 8);
        double expected = 15;
        assertThat(result, is(expected));
    }

    @Test
    public void subtract() {
        Calculator calc = new Calculator();
        double result = calc.subtract(8, 7);
        double expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void div() {
        Calculator calc = new Calculator();
        double result = calc.div(8, 2);
        double expected = 4;
        assertThat(result, is(expected));
    }

    @Test
    public void multiple() {
        Calculator calc = new Calculator();
        double result = calc.multiple(8, 7);
        double expected = 56;
        assertThat(result, is(expected));
    }
}