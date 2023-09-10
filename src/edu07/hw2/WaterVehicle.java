package edu07.hw2;

abstract public class WaterVehicle extends Passengers implements Vehicle {

    public WaterVehicle(int passengers) {
        super(passengers);
    }

    abstract void isSailing();
}
