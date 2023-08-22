package class3.task3;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Scanner;

public class Person {
    private final static Scanner scanner = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private Integer birthYear;

    public Person() {
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Integer getAge() {
        return Objects.nonNull(birthYear) ? LocalDate.now().getYear() - birthYear : null;
    }

    public void input() throws NumberFormatException, IllegalArgumentException{
        System.out.println("Input first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Input last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Input birth year: ");
        int birthYear = Integer.parseInt(scanner.nextLine());

        if (birthYear > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Birth year does not have to be after the current time");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;

    }

    public void output() {
        boolean isAnythingInitialised = false;
        if (Objects.nonNull(firstName)) {
            System.out.println("First name is ".concat(this.firstName));
            isAnythingInitialised = true;
        }
        if (Objects.nonNull(lastName)) {
            System.out.println("Last name is ".concat(this.lastName));
            isAnythingInitialised = true;
        }
        if (Objects.nonNull(birthYear)) {
            System.out.println("Birth year is " + this.birthYear);
            isAnythingInitialised = true;
        }
        if (!isAnythingInitialised) {
            System.out.println("The person doesn't have data");
        }
    }

    public void changeName(String fn, String ln) {
        this.firstName = fn;
        this.lastName = ln;
    }
}
