package class8.task1;

import java.util.Objects;

public abstract class Person {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) throws IllegalArgumentException {
        if (Objects.isNull(fullName) || age < 0) {
            throw new IllegalArgumentException("Data in incorrect");
        }
        this.fullName = fullName;
        this.age = age;
    }

    public static class FullName implements Cloneable {
        private String firstName;
        private String lastName;

        public FullName(String firstName, String lastName) throws IllegalArgumentException {
            if (Objects.isNull(firstName) || Objects.isNull(lastName)) {
                throw new IllegalArgumentException("First name and last name cannot be null");
            }
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public void setFirstName(String firstName) {
            if (Objects.isNull(firstName)) {
                throw new IllegalArgumentException("First name cannot be null");
            }
            this.firstName = firstName;
        }

        @Override
        public FullName clone() throws CloneNotSupportedException {
            return (FullName) super.clone();
        }
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) throws IllegalArgumentException {
        if (Objects.isNull(fullName)) {
            throw new IllegalArgumentException("FullName cannot be null");
        }
        this.fullName = fullName;
    }


    public String info() {
        return String.format("First name: %s, Last name: %s, Age: %d", fullName.firstName, fullName.lastName, age);
    }

    public abstract String activity();
}
