package class6.task2;

import java.util.Objects;

public class Developer extends Employee{
    private String position;

    public Developer(String name, int age, double salary, String position) throws IllegalArgumentException{
        super(name, age, salary);
        if (Objects.isNull(position)) {
            throw new IllegalArgumentException("Position cannot be null");
        }
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) throws IllegalArgumentException{
        if (Objects.isNull(position)) {
            throw new IllegalArgumentException("Position cannot be null");
        }
        this.position = position;
    }

    @Override
    public String report() {
        return String.format("Name: %s, Age: %d, " +
                "Salary: ₴ %.2f, Position: %s.", getName(), getAge(), getSalary(), position);
    }
}