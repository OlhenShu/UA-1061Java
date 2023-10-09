package Homework6;

public class Swallow extends FlyingBird {
    public Swallow() {
        super("Flight Feathers", 6);
    }

    @Override
    public String getName() {
        return "Swallow: ";
    }

    @Override
    public void fly() {
        super.fly();
    }
}