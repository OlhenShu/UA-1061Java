package Homework2;

import java.util.Scanner;
import java.time.Year;

public class Person {
    private  String firstName;
    private  String lastName;
    private int birthYear;

    public Person() {

    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public int getAge(){
        return Year.now().getValue() - birthYear;
    }
    public void input(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first name: ");
        this.firstName = input.nextLine();

        System.out.println("Enter the second name: ");
        this.lastName = input.nextLine();

        System.out.println("Enter the birth year: ");
        this.birthYear = input.nextInt();



    }
    public void output(){
        System.out.println("Info about the person: ");
        System.out.println("First Name: " + firstName);
        System.out.println("Second Name: " + lastName);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Age: " + getAge());
    }

    public void changeName(String fn, String ln){

        if (fn != null && !fn.isEmpty()) {
            this.firstName = fn;
        }

        if (ln != null && !ln.isEmpty()) {
            this.lastName = ln;
        }
    }
    public static void main(String[] args) {
        // Create 5 objects of Person type
        Person[] people = new Person[5];

        // Input information about each person
        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();
            people[i].input();
        }

        // Output information about each person
        for (Person person : people) {
            person.output();
            System.out.println();
        }
    }
}
