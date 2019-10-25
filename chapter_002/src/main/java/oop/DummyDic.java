package oop;

public class DummyDic {
    public String engToRus(String eng) {
        String e = eng;
        e = "LOL";
        return e;
    }
    public static void main(String[] args) {
        DummyDic dic = new DummyDic();
        String eng = "LOL";
        dic.engToRus(eng);
        System.out.println("Неизвестное слово " + eng);
    }
}