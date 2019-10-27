package oop;

public class BallStory {
    public static void main(String[] args) {
        Ball Kolobok = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        hare.tryEat(Kolobok);
        wolf.tryEat(Kolobok);
        fox.tryEat(Kolobok);
        Kolobok.wasEaten(fox);
    }
}
