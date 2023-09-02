package edu05.hw3;

import edu05.InputData;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Crossover", 2002, 2.2),
                new Car("Truck", 2001, 3.0),
                new Car("Hatchback", 2022, 2.0),
                new Car("Sports Car", 1987, 5.0),
        };

        int searchYear = InputData.getEnteredIntNumber("What year of production of the car are you interested in?");
        Car[] сarsByYear = getCarsByYear(cars, searchYear);
        if (сarsByYear.length == 0) {
            System.out.println("Unfortunately, nothing was found.");
        } else {
            System.out.println("Cars of " + searchYear + " year of production:");
            for (Car car : сarsByYear) {
                if (car != null) {
                    System.out.println(car.getType() + " " + "(" + car.getEngineCapacity() + "l) " + car.getYearOfProduction() + " Y");
                }
            }
        }
        Arrays.sort(cars, new SortByYear());
        System.out.println();
        System.out.println("List of all available cars:");
        for (Car car : cars) {
            System.out.println(car.getType() + " " + "(" + car.getEngineCapacity() + "l) " + car.getYearOfProduction() + " Y");
        }
    }

    protected static Car[] getCarsByYear(Car[] cars, int year) {
        Car[] result = new Car[0];
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYearOfProduction() == year) {
                result = addCarToArray(result, cars[i]);
            }
        }

        return result;
    }

    protected static Car[] addCarToArray(Car[] cars, Car car) {
        Car[] temp = new Car[cars.length + 1];
        for (int i = 0; i < cars.length; i++) {
            temp[i] = cars[i];
        }
        temp[temp.length - 1] = car;

        return temp;
    }
}
