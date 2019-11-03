package oop;

public class Battery {
    private int load;

    public Battery(int exchange) {
        this.load = exchange;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        another.load = 0;
    }

    public static void main (String [] args) {
        Battery first = new Battery(30);
        Battery second = new Battery (70);
        System.out.println("First :" + first.load + ": second :" + second.load);
        first.exchange(second);
        System.out.println("First :" + first.load + ": second :" + second.load);
    }
}