package com.softserve.java.edu03.practical;

public class Employee {
    // Private fields
    private String name;
    private double rate;
    private double hours;

    // Static field
    public static double totalSum = 0;

    // Default constructor
    public Employee() {}

    // Constructors with parameters
    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    // Getters and Setters for the fields
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    // Methods
    public double getSalary() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Rate: " + rate + ", Hours: " + hours + ", Salary: " + getSalary();
    }

    public double getBonuses() {
        return getSalary() * 0.10;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        // Create 3 objects of type Employee and input information about them
        Employee e1 = new Employee("John", 20, 10);
        Employee e2 = new Employee("Jane", 25, 8);
        Employee e3 = new Employee("Doe", 30, 5);

        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());

        // Display the total salary of all employees to the console
        System.out.println("Total salary of all employees: " + Employee.totalSum);
    }
}
