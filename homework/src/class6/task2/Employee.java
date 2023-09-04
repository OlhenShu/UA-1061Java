package class6.task2;

import java.util.Objects;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) throws IllegalArgumentException{
        if (Objects.isNull(name) || age <= 0 || salary <= 0) {
            throw new IllegalArgumentException("Name is null or age isn't positive or salary isn't positive");
        }
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if (Objects.isNull(name)) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException {
        if (age <= 0) {
            throw new IllegalArgumentException("Age should be positive");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws IllegalArgumentException {
        if (salary <= 0) {
            throw new IllegalArgumentException("Salary should be positive");
        }
        this.salary = salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, " +
                "Salary: ₴ %.2f.", name, age, salary);
    }
}
