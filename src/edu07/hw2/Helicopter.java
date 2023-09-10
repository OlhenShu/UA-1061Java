package edu07.hw2;

public class Helicopter extends FlyingVehicle {
    private int weight;
    private int maxHeight;

    public Helicopter(int passengers, int weight, int maxHeight) {
        super(passengers);
        this.weight = weight;
        this.maxHeight = maxHeight;
    }

    @Override
    void fly() {
        System.out.println("fly");
    }

    @Override
    void land() {
        System.out.println("land");
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }
}
