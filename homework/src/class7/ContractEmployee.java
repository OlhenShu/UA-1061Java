package class7;

import java.util.Objects;

public class ContractEmployee extends Employee {
    private final String federalTaxIdMember;
    private double hourlyRate;
    private double hoursWorked;

    public ContractEmployee(String employeeId, String federalTaxIdMember, String name, double hourlyRate, double hoursWorked) throws IllegalArgumentException {
        super(employeeId, name);
        if (Objects.isNull(federalTaxIdMember) || hourlyRate < 0 || hoursWorked < 0) {
            throw new IllegalArgumentException("Wrong data");
        }
        this.federalTaxIdMember = federalTaxIdMember;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}
