package edu07.hw1;

import java.util.Comparator;

public class SortBySalary implements Comparator<Employee> {
    public int compare(Employee a, Employee b) {
        return (int) -(a.calculatePay() - b.calculatePay());
    }
}
