package class7;

import java.util.Objects;

public class SalariedEmployee extends Employee {
    private final String socialSecurityNumber;
    private double fixedMonthlyPayment;

    public SalariedEmployee(String employeeId, String socialSecurityNumber, String name, double fixedMonthlyPayment) throws IllegalArgumentException {
        super(employeeId, name);
        if (Objects.isNull(socialSecurityNumber) || fixedMonthlyPayment < 0) {
            throw new IllegalArgumentException("Wrong data");
        }
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthlyPayment = fixedMonthlyPayment;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }


}
