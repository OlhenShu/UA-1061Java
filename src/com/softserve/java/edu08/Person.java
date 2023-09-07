package com.softserve.java.edu08;

public class Person implements Cloneable {
    private FullName fullName;
    private int age;

    public Person(FullName fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName=" + fullName +
                ", age=" + age +
                '}';
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        Person person2 = (Person) super.clone();
        person2.fullName =  person2.fullName.clone();
        return person2;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person(new FullName("Mike", "Green"),19);
        Person person2 =  person.clone();

        System.out.println("Origin " + person.fullName.getFirstName() +
                person.fullName.getLastName() + person.age);
        System.out.println("Copy " + person2.fullName.getFirstName() +
                person2.fullName.getLastName() + person2.age);

        person2.fullName.setFirstName("Nick");
        person2.fullName.setLastName("Brown");
        person2.age = 25;
        System.out.println("*********");
        System.out.println("Origin " + person.fullName.getFirstName() +
                person.fullName.getLastName() + person.age);
        System.out.println("Copy " + person2.fullName.getFirstName() +
                person2.fullName.getLastName() + person2.age);
    }
}
