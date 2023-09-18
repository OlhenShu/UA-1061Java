package org.homework.lesson7;
import java.util.Comparator;
public class SalaryComparatror implements Comparator<Employee> {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o2.calculatePay().intValue() - o1.calculatePay().intValue();
        }

}
