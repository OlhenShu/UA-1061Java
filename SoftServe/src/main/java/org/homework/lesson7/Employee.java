package org.homework.lesson7;

abstract public class Employee implements Payment{
    String employeerId;
    String name;

    public abstract Double calculatePay();

    public Employee(String employeerId, String name) {
        this.employeerId = employeerId;
        this.name = name;
    }

    public String getEmployerId() {
        return employeerId;
    }

    public String getName() {
        return name;
    }
}
