package Homework7Task2;

import Homework7Task2.WaterVehicle;

public class Liner extends WaterVehicle {
    private int floors;

    public Liner(int passengers, int floors) {
        super(passengers);
        this.floors = floors;
    }

        @Override
        void isSailing() {
        }

        public int getFloors() {
            return floors;
        }

            public void setFloors(int floors) {
                this.floors = floors;

        }
    }

