package class5.task3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class SortingAndFindingByYearCar {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This is an initial list of cars");
        List<Car> initialListOfCars = Stream.of(
                new Car(CarType.CROSSOVER, 2004, 2000),
                new Car(CarType.CROSSOVER, 2022, 1500),
                new Car(CarType.CROSSOVER, 2017, 2500),
                new Car(CarType.CROSSOVER, 2009, 3000)
        ).toList();
        initialListOfCars.forEach(System.out::println);

        System.out.println("\nThis is a sorted list of cars");
        List<Car> sortedListOfCars = new ArrayList<>(initialListOfCars).stream()
                .sorted(Car.compareByYear())
                .toList();
        sortedListOfCars.forEach(System.out::println);

        System.out.print("\nEnter the year in order to find particular cars: ");
        int year;
        try {
            year = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("You have just entered the wrong data");
            return;
        }

        List<? extends Car> filteredByYearCars = Car.getAllByYear(sortedListOfCars, year);
        if (filteredByYearCars.isEmpty()) {
            System.out.println("There are not cars by the input year");
        } else {
            filteredByYearCars.forEach(System.out::println);
        }
    }
}