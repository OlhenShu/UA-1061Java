package Homework6;

public class Kiwi extends NonFlyingBird {
    public Kiwi() {
        super("Contour Feathers", 4);
    }

    @Override
    public String getName() {
        return "Kiwi: ";
    }

    @Override
    public void fly() {
        super.fly();
    }
}