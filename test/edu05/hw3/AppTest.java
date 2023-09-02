package edu05.hw3;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private static Car[] cars = new Car[5];

    @BeforeAll
    static void beforeAll() {
        cars = new Car[]{
                new Car("Crossover", 2008, 2.2),
                new Car("Truck", 2000, 3.0),
                new Car("Hatchback", 2023, 2.0),
                new Car("Sports Car", 1997, 5.0),
        };
    }

    @Test
    void TestGetCarsByYear() {
        Car[] expected = new Car[]{cars[2]};
        assertArrayEquals(expected, App.getCarsByYear(cars, 2023));
    }
}