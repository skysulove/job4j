package ru.job4j.condition;

public class Triangle {
    /**
     * Метод вычисления полупериметра по длинам сторон.
     * Формула (a + b + c) / 2
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точкамм a c
     * @param c расстояине меэжу точками b c
     * @return Периметр.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public double area(int x1, int y1, int x2, int y2, int x3, int y3) {
        double rsl = -1;
        double a = new Point().distance(x1, y1, x2, y2);
        double b = new Point().distance(x2, y2, x3, y3);
        double c = new Point().distance(x1, y1, x3, y3);
        double p = this.period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки а с.
     * @param c Длина от точки b c.
     * @return
     */
    private boolean exist(double a, double b, double c) {
        if ((a <= b +  c ) & (b <= a + c) & (c <= a + b)) {
            return true;
        }
        return false;
    }
}