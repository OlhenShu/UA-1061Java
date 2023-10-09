package com.softserve.java.edu03;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public void print() {
        System.out.println("It's a class Student");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("cant be null");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 130) {
            throw new IllegalArgumentException("cant be more or less");
        }
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade < 0.0 || grade > 100.0) {
            throw new IllegalArgumentException("cant be more or less");
        }
        this.grade = grade;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}

class DemoStudent {
    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setName("Alice");
        st1.setAge(19);
        st1.setGrade(12);
        st1.print();

        System.out.println(st1);

        Student st2 = new Student("Bob", 21, 90);
        st2.setName("Bobby");
        System.out.println(st2);
    }
}