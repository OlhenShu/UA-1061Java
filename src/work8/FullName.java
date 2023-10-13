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

    protected String name;
    private FullName FullName;
    private int age;

    public Person(FullName FullName, int age) {
        this.FullName = FullName;
        this.age = age;
    }

    public Person(String name) {
    }

    public String TheName() {
        return "First Name " + FullName.getFirstName() + ", last name " + FullName.getLastName() + ", age " + age;
    }

    public void info() {
    }

    public abstract String activity();

}

class Main {
    public static void main(String[] args) {
        FullName fullName = new FullName("Jack", "Suick");
        Person person = new Person(fullName, 25) {
            @Override
            public String activity() {
                return null;
            }
        };

        System.out.println("Person Info: " + person.TheName());
        System.out.println("Activity: " + person.activity());
    }
}
