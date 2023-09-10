package edu08.hw1;

public class PersonTest extends Person {
    private String activity;

    public PersonTest(FullName fullName, int age, String activity) {
        super(fullName, age);
        this.activity = activity;
    }

    @Override
    public String activity() {
        return this.activity;
    }
}
