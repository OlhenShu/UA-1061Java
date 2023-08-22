package class3.task3;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Vitalii", "Fedyk");
        person1.output();
        System.out.println();

        Person person2 = new Person();
        person2.output();
        System.out.println("Age is " + person2.getAge() + "\n");

        Person person3 = new Person();
        try {
            person3.input();
        } catch (NumberFormatException exception) {
            System.out.println("Number format for birth year is inappropriate");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        person3.output();
        System.out.println();

        Person person4 = new Person();
        person4.changeName("Nazarii", "Mryhlotskiy");
        person4.output();
        System.out.println();

        Person person5 = new Person();
        try {
            person5.input();
        } catch (NumberFormatException exception) {
            System.out.println("Number format for birth year is inappropriate");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Age is " + person5.getAge());
    }
}
