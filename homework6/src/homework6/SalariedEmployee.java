package homework6;
class SalariedEmployee extends Employee{
    int fixed_salary,federalTaxIdmemeber;
    SalariedEmployee(String employeeID, String name,int fixed_salary, int federalTaxIdmember) {
        super(employeeID, name);
        this.fixed_salary = fixed_salary;
    }
    public int calculatePay(){
        return fixed_salary;
    }

}