package edu03;

public class Util {
    public static void print(String welcomeMessage, Object... messages) {
        System.out.println(welcomeMessage);
        for (Object msg : messages) {
            System.out.println(msg);
        }
    }
}

class Runner {
    public static void main(String[] args) {
        Student student = new Student();
        Util.print("Hello", "Hi", "Welcome", 10, 20.5, false, student);
    }
}
