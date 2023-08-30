package org.practice.lesson3;

public class Employee {
    private String name;
    private double rate;
    private double hours;

    public static double totalSum;

    public Employee() {
    }

    public Employee(
            String name,
            double rate,
            double hours
    ) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public double getSalary(){
        return rate * hours;
    }

    public double getBonuses(){
        return getSalary() * 0.1;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

}
