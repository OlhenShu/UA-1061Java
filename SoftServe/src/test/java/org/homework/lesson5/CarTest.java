package org.homework.lesson5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    void test1() {
        Car car = new Car("type", 2020, 2.3);

        assertEquals("type", car.getType());
        assertEquals(2020, car.getYearOfProduction());
        assertEquals(2.3, car.getEngineCapacity());

    }

    @Test
    void test2() {
        Car car = new Car();

        car.setType("BMW");
        car.setYearOfProduction(2020);
        car.setEngineCapacity(2.3);

        assertEquals("BMW", car.getType());
        assertEquals(2020, car.getYearOfProduction());
        assertEquals(2.3, car.getEngineCapacity());

    }
}
