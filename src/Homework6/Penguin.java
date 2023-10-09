package Homework6;

public class Penguin extends NonFlyingBird {
    public Penguin() {
        super("Down Feathers", 1);
    }

    @Override
    public String getName() {
        return "Penguin: ";
    }

    @Override
    public void fly() {
        super.fly();
    }
}
