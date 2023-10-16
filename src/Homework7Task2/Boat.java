package Homework7Task2;

import Homework7Task2.WaterVehicle;

public class Boat extends WaterVehicle {
    private int volume;

    public Boat(int passengers, int volume) {
        super(passengers);
        this.volume = volume;
    }

    @Override
    void isSailing() {
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
            this.volume = volume;

        }
    }

