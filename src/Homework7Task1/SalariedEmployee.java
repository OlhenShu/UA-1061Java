package Homework7Task1;

class SalariedEmployee extends Employee {
    private double monthlySalary;

    public SalariedEmployee(String employeeId, String name, double monthlySalary) {
        super(employeeId, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void work() {
        // Implement work specific to salaried employees
    }

    @Override
    public double calculatePay() {
        return monthlySalary; // Fixed monthly payment for salaried employees
    }
}