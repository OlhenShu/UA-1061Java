package Homework7Task1;
abstract class Employee implements Payment {
    private String employeeId;
    private String name;

    protected Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public abstract void work();
}
