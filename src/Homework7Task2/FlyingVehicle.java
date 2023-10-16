package Homework7Task2;

abstract public class FlyingVehicle extends Passengers implements Vehicle {
    public FlyingVehicle(int passengers) {
        super(passengers);
}
    abstract void land();

    abstract void fly ();


    }
