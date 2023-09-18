package org.homework.lesson7;

class ContractEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    private String federalTaxId;

    public ContractEmployee(String employeerId, String name, double hourlyRate, int hoursWorked, String federalTaxId) {
        super(employeerId, name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        this.federalTaxId = federalTaxId;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public String getFederalTaxId() {
        return federalTaxId;
    }

    @Override
    public Double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

