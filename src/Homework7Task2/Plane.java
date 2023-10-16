package Homework7Task2;

public class Plane extends FlyingVehicle {
    private int maxDistance;

    public Plane (int passengers, int maxDistance){
    super (passengers);
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    void land() {
    }

    @Override
    void fly() {
    }
}
