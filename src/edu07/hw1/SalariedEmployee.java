package edu07.hw1;

public class SalariedEmployee extends Employee implements Payment {

    private String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(
            String employeeId,
            String name,
            String socialSecurityNumber,
            double fixedMonthlyPayment
    ) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return this.fixedMonthlyPayment;
    }

    @Override
    public String report() {
        return String.format(
                "ID: %s, Name: %s, Average monthly wage: \u20B4 %.2f.",
                this.getEmployeeId(),
                this.getName(),
                this.calculatePay()
        );
    }
}
