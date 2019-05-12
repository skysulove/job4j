package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int thrid) {
        int result = first > second ? first : second;
        return result > thrid ? result : thrid ;
    }
}