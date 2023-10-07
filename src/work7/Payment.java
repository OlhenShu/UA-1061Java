package work7;

interface Payments {
    double calculatePay();
}

abstract class Employee {
    String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }
}

class SalariedEmployee extends Employee implements Payments {
    String socialSecurityNumber;

    public SalariedEmployee(String employeeId, String socialSecurityNumber) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public double calculatePay() {
        return 4000.0;
    }
}
class ContractEmployee extends Employee implements Payments {
    String federalTaxId;

    public ContractEmployee(String employeeId, String federalTaxId) {
        super(employeeId);
        this.federalTaxId = federalTaxId;
    }

    @Override
    public double calculatePay() {
        return 20.0 * 40.0;
    }
}

public class Payment {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("S12345", "123-45-6789");
        ContractEmployee contractEmployee = new ContractEmployee("C67890", "987-65-4321");

        System.out.println("Salaried Employee ID: " + salariedEmployee.employeeId);
        System.out.println("Salaried Employee SSN: " + salariedEmployee.socialSecurityNumber);
        System.out.println("Salaried Employee Pay: $" + salariedEmployee.calculatePay());

        System.out.println("Contract Employee ID: " + contractEmployee.employeeId);
        System.out.println("Contract Employee Federal Tax ID: " + contractEmployee.federalTaxId);
        System.out.println("Contract Employee Pay: $" + contractEmployee.calculatePay());
    }
}//

