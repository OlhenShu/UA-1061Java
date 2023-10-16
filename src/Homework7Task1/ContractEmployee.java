package Homework7Task1;

class ContractEmployee extends Employee implements Payment {
    private double hourlyRate;
    private int hoursWorked;
public ContractEmployee(String employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        }

@Override
public void work() {
}

@Override
public double calculatePay() {
        return hourlyRate * hoursWorked;
        }
        }