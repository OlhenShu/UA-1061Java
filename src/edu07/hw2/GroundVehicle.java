package edu07.hw2;

abstract public class GroundVehicle extends Passengers implements Vehicle {

    public GroundVehicle(int passengers) {
        super(passengers);
    }

    abstract void drive();
}
