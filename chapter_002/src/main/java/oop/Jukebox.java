package oop;

public class Jukebox {
    public void music(int position) {
        int p = position;
        if(p == 1) {
            System.out.println("Пусть бегут неуклюже");
        } else if (p == 2) {
            System.out.println("Спокойной ночи");
        } else {
            System.out.println("Песня не найдена");
        }
    }
    public static void main(String[] args) {
        Jukebox patefon = new Jukebox();
        int song = 0;
        patefon.music(song);
    }
}