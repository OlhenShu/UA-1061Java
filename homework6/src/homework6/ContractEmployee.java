package homework6;
class ContractEmployee extends Employee{
    int hour_rate,hours_worked;
    public String socialSecurityNumber;
    ContractEmployee(String employeeID, String name,int hour_rate, int hours_worked,String socialSecurityNumber) {
        super(employeeID, name);
        this.hours_worked = hours_worked;
        this.hour_rate = hour_rate;
    }

    public int calculatePay(){
        return hour_rate*hours_worked;
    }

}