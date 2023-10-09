package Homework6;

public class Eagle extends FlyingBird {
    public Eagle() {
        super("Flight Feathers", 2);
    }

    @Override
    public String getName() {
        return "Eagle: ";
    }

    @Override
    public void fly() {
        super.fly();
    }
}