package edu09.hw2;

public enum Subject {
    ENGLISH("English"),
    COMPUTER_SCIENCE("Computer Science"),
    PHYSICS("Physics"),
    MATH("Math");

    private final String name;

    Subject(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
