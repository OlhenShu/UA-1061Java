package homework6;
import java.util.*;
abstract class Employee implements Payment{
    String employeeID;
    String name;
    public Employee(String employeeID, String name){
        this.employeeID = employeeID;
        this.name = name;
    }
    public String GetID(){
        return employeeID;
    }
    public String GetName(){
        return name;
    }
}