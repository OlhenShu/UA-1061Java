package class5.task3;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Car {
    private CarType carType;
    private int yearOfProduction;
    private double engineCapacity; //in cc

    public Car(CarType carType, int yearOfProduction, double engineCapacity) throws IllegalArgumentException{
        if (Objects.isNull(carType) || engineCapacity <= 0) {
            throw new IllegalArgumentException("Either type or engine capacity is incorrect");
        }
        this.carType = carType;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public static Comparator<Car> compareByYear() {
        return (o1, o2) -> {
            int yearOfTheFirstCar = o1.getYearOfProduction();
            int yearOfTheSecondCar = o2.getYearOfProduction();

            return Integer.compare(yearOfTheFirstCar, yearOfTheSecondCar);
        };
    }

    public static List<? extends Car> getAllByYear(List<? extends Car> list, int year) {
        return list.stream()
                .filter(o -> o.getYearOfProduction() == year)
                .toList();
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }
}
