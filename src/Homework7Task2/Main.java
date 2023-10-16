package Homework7Task2;

public class Main{
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[7];
        vehicles[0] = new Liner(80, 2);
        vehicles[1] = new Boat(3, 8);
        vehicles[2] = new Plane(225, 1200);
        vehicles[3] = new Helicopter(4, 450, 2000);
        vehicles[4] = new Bus(45, "Chernivtsi - Lisbon");
        vehicles[5] = new Motorcycle(1, 330);
        vehicles[6] = new Car(5, "Mercedes");

        for (Vehicle vehicle : vehicles) {
            System.out.println("----------------------------");
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

