package class7;

import java.util.*;

public abstract class Employee implements Payment{
    private final String employeeId;
    private final String name;

    public Employee(String employeeId, String name) throws IllegalArgumentException{
        if (Objects.isNull(employeeId) || Objects.isNull(name)) {
            throw new IllegalArgumentException("Wrong data");
        }
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }
}
