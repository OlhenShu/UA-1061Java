package Homework5;

import java.util.Scanner;

public class Car {
    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Honda Civic", 2021, 1.5);
        Car car2 = new Car("Toyota Camry", 2022, 2.5);
        Car car3 = new Car("Ford Mustang", 2023, 5);
        Car car4 = new Car("Volkswagen Golf", 2023, 1.4);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year of production: ");
        int year = scanner.nextInt();

        // Flag to track whether a car has been found in the specified year
        boolean carFound = false;

        System.out.println("Cars produced in " + year + ":");
        if (car1.yearOfProduction == year) {
            System.out.println(car1.type + " with engine capacity " + car1.engineCapacity);
            carFound = true;
        }
        if (car2.yearOfProduction == year) {
            System.out.println(car2.type + " with engine capacity " + car2.engineCapacity);
            carFound = true;
        }
        if (car3.yearOfProduction == year) {
            System.out.println(car3.type + " with engine capacity " + car3.engineCapacity);
            carFound = true;
        }
        if (car4.yearOfProduction == year) {
            System.out.println(car4.type + " with engine capacity " + car4.engineCapacity);
            carFound = true;
        }

        if (!carFound) {
            System.out.println("No cars produced in " + year);
        }

        Car[] cars = {car1, car2, car3, car4};
        sortCarsByYear(cars);
        System.out.println("\nCars sorted by year of production:");
        for (Car car : cars) {
            System.out.println(car.type + " produced in " + car.yearOfProduction);
        }
    }

    public static void sortCarsByYear(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].yearOfProduction > cars[j].yearOfProduction) {
                    Car temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
        }
    }
}
