package edu07.hw2;

abstract public class FlyingVehicle extends Passengers implements Vehicle {

    public FlyingVehicle(int passengers) {
        super(passengers);
    }

    abstract void fly();

    abstract void land();
}
