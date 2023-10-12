package work8;
public class FullName {
    private String firstName;
    private String lastName;

    public FullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

}

abstract class Person {

    private FullName FullName;
    private int age;

    public Person(FullName FullName, int age) {
        this.FullName = FullName;
        this.age = age;
    }

    public String TheName() {
        return "First Name " + FullName.getFirstName() + ", last name " + FullName.getLastName() + ", age " + age;
    }

    public abstract String activity();

}

public class Main {
    public static void main(String[] args) {
        FullName fullName = new FullName("John", "Doe");
        Person person = new Person(fullName, 30);

        System.out.println("Person Info: " + person.TheName());
        System.out.println("Activity: " + person.activity());
    }
}
