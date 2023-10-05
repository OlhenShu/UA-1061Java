package work5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Car implements Comparable<Car> {
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

    @Override
    public int compareTo(Car otherCar) {
        return Integer.compare(this.yearOfProduction, otherCar.yearOfProduction);
    }
}

public class Cars {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Sedan", 2020, 2.0));
        cars.add(new Car("SUV", 2018, 3.5));
        cars.add(new Car("Hatchback", 2022, 1.8));
        cars.add(new Car("Convertible", 2019, 2.5));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year to search for cars: ");
        int yearToSearch = scanner.nextInt();
        for (Car car : cars) {
            if (car.getYearOfProduction() == yearToSearch) {
                System.out.println("Car Type: " + car.getType() +
                        ", Year: " + car.getYearOfProduction() +
                        ", Engine Capacity: " + car.getEngineCapacity());
            }
        }

        Collections.sort(cars);
        System.out.println("\nSorted Cars by Year of Production:");
        for (Car car : cars) {
            System.out.println("Car Type: " + car.getType() +
                    ", Year: " + car.getYearOfProduction() +
                    ", Engine Capacity: " + car.getEngineCapacity());
        }
    }
}

