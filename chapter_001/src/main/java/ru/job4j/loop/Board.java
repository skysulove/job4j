package ru.job4j.loop;

public class Board {
    public String paint (int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++ ) {
                //условие проверки, что писать пробел или Х
                //Выше в задании мы определим закономерность, когда нужно проставлять Х
                int sum = i + j;
                if (sum % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            System.getProperty("line.separator");
            screen.append(ln); // Добавляем перевод на новую строку.
        }
        return screen.toString();
    }
}