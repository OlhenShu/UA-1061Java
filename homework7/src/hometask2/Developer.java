package hometask2;

public class Developer extends Employee{
    private String position;
    public Developer(String name, int age, double salary,String position) {
        super(name, age, salary);
        this.position=position;
    }
    public String getpos(){
        return position;
    }

    @Override
    public String report(){
        return String.format(
                "Name: %s, Age: %d, Position: %s, Salary: \u20b4 %.2f",
                this.getName(),this.getAge(),this.getpos(),this.getSalary()
        );
    }
}
