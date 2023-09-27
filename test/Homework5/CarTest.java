package Homework5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CarTest {

    @Test
    void testCarConstructor() {
        Car car = new Car("Honda Civic", 2021, 1.5);
        assertEquals("Honda Civic", car.getType());
        assertEquals(2021, car.getYearOfProduction());
        assertEquals(1.5, car.getEngineCapacity());
    }

    @Test
    void testSortCarsByYear() {
        Car car1 = new Car("Honda Civic", 2021, 1.5);
        Car car2 = new Car("Toyota Camry", 2022, 2.5);
        Car car3 = new Car("Ford Mustang", 2020, 5);
        Car[] cars = {car1, car2, car3};

        Car.sortCarsByYear(cars);

        assertEquals("Ford Mustang", cars[0].getType());
        assertEquals("Honda Civic", cars[1].getType());
        assertEquals("Toyota Camry", cars[2].getType());
    }
}
