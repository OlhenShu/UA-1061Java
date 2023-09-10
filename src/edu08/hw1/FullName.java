package edu08.hw1;

public class FullName implements Cloneable {
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
    public FullName clone() {
        try {
            FullName fullName = (FullName) super.clone();
            return fullName;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
