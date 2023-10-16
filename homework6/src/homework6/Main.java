package homework6;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployee("01", "Stefan", 70,6 ,"3257" ),
                new SalariedEmployee("05", "Nazarii", 325,1285),
                new SalariedEmployee("03", "Juliet", 895,124),
        };
    Arrays.sort(employees, (emp1,emp2)->Double.compare(emp2.calculatePay(),emp1.calculatePay()));
        double sumall=0;
        for (Employee i: employees){
            System.out.println(i.GetID() + " - " +i.GetName());
            sumall += i.calculatePay();
        }
        double avarage =sumall/ employees.length;
        System.out.println("Avarage of employees are: "+avarage);
    }

}


