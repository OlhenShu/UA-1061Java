package org.homework.lesson7;

class SalariedEmployee extends Employee {
    private double fixedMonthlyPayment;
    private String socialSecurityNumber;

    public SalariedEmployee(String employeerId, String name, double fixedMonthlyPayment, String socialSecurityNumber) {
        super(employeerId, name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double getFixedMonthlyPayment() {
        return fixedMonthlyPayment;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public Double calculatePay() {
        return fixedMonthlyPayment;
    }
}
