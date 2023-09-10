package edu07.hw1;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdMember;
    private double hourlyRate;
    private double hoursWorked;

    public ContractEmployee(
            String employeeId,
            String name,
            String federalTaxIdMember,
            double hourlyRate,
            double hoursWorked
    ) {
        super(employeeId, name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return this.hourlyRate * this.hoursWorked;
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
