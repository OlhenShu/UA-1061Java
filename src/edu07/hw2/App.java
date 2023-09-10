package edu07.hw2;

public class App {

    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Liner(150, 3),
                new Boat(5, 15),
                new Plane(100, 800),
                new Helicopter(20, 3, 2),
                new Bus(30, "Kyiv - Lviv"),
                new Motorcycle(1, 250),
                new Car(4, "Toyota"),
        };

        for (Vehicle vehicle : vehicles) {
            System.out.println("===================//======================");
            if (vehicle instanceof Liner) {
                System.out.println("Liner " + "passengers: " + ((Liner) vehicle).getPassengers());
                System.out.println("Floors: " + ((Liner) vehicle).getFloors());
                ((Liner) vehicle).isSailing();
            }
            if (vehicle instanceof Boat) {
                System.out.println("Boat " + "passengers: " + ((Boat) vehicle).getPassengers());
                System.out.println("volume: " + ((Boat) vehicle).getVolume());
                ((Boat) vehicle).isSailing();
            }
            if (vehicle instanceof Plane) {
                System.out.println("Plane " + "passengers: " + ((Plane) vehicle).getPassengers());
                System.out.println("maxDistance: " + ((Plane) vehicle).getMaxDistance());
                ((Plane) vehicle).fly();
                ((Plane) vehicle).land();
            }
            if (vehicle instanceof Helicopter) {
                System.out.println("Helicopter " + "passengers: " + ((Helicopter) vehicle).getPassengers());
                System.out.println("weight: " + ((Helicopter) vehicle).getWeight()
                        + " Max Height: " + ((Helicopter) vehicle).getMaxHeight()
                );
                ((Helicopter) vehicle).fly();
                ((Helicopter) vehicle).land();
            }
            if (vehicle instanceof Bus) {
                System.out.println("Bus " + "passengers: " + ((Bus) vehicle).getPassengers());
                System.out.println("route: " + ((Bus) vehicle).getRoute());
                ((Bus) vehicle).drive();
            }
            if (vehicle instanceof Motorcycle) {
                System.out.println("Motorcycle " + "passengers: " + ((Motorcycle) vehicle).getPassengers());
                System.out.println("Max Speed: " + ((Motorcycle) vehicle).getMaxSpeed());
                ((Motorcycle) vehicle).drive();
            }
            if (vehicle instanceof Car) {
                System.out.println("Car " + "passengers: " + ((Car) vehicle).getPassengers());
                System.out.println("Model: " + ((Car) vehicle).getModel());
                ((Car) vehicle).drive();
            }
        }
    }
}
