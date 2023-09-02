package edu05.hw3;

import java.util.Comparator;

public class SortByYear implements Comparator<Car> {
    public int compare(Car a, Car b)
    {
        return a.getYearOfProduction() - b.getYearOfProduction();
    }
}
