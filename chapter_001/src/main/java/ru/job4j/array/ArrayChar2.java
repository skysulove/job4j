package ru.job4j.array;
/**
 * Обертка над строкой.
 */
public class ArrayChar2 {

    public ArrayChar2() {

    }

    public ArrayChar2(String hello) {
    }

    /**
     * Проверяет. что слово начинается с префикса.
     *
     * @param postfix постфикс.
     * @return если слово начинаеться с префикса
     */
    public boolean endsWith(String work, String postfix   ) {
        boolean result = true;
        char[] post = postfix.toCharArray();
        char[] wrk = work.toCharArray();
        for (int i = 0; i != post.length; i++) {
            if (post[i] <= wrk[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}