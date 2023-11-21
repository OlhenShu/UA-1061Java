package Arrays.Loops.Homework.Task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class CarInformation {

    private static final int NUMBER_OF_CARS = 4;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] yearsOfManufacture = new int[NUMBER_OF_CARS];
        getInputYears(input, yearsOfManufacture);

        Car[] cars = {
                new Car("Sedan", yearsOfManufacture[0], 385),
                new Car("Cabriolet", yearsOfManufacture[1], 620),
                new Car("Crossover", yearsOfManufacture[2], 260),
                new Car("Coupe", yearsOfManufacture[3], 740)
        };

        Arrays.sort(cars, Comparator.comparingInt(Car::getYear));

        for (Car car : cars) {
            System.out.println("Type of the car - " + car.getType() + "\n" +
                    "Year of manufacture - " + car.getYear() + "\n" +
                    "Engine capacity in horsepower - " + car.getEngineCapacity() + "\n");
        }
    }

    private static void getInputYears(Scanner input, int[] years) {
        for (int i = 0; i < years.length; i++) {
            System.out.println("Enter the year of manufacture of car " + (i + 1) + ":");
            years[i] = input.nextInt();
        }
    }
}
