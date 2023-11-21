package Arrays.Loops.PracticalTasks.Employees;

public class Employee {
    private String name;
    private int departmentNumber;
    private double salary;
    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }
}
