package com.softserve.java.edu13;

public class MyGreetingService {
    public static void main(String args[]) {
        GreetingService greetService1 = message -> System.out.println("Hello, " + message);
        GreetingService greetService2 = (message) -> System.out.println("Hello from second service " + message);
        greetService1.printMessage("Alice");
        greetService2.printMessage("Bob");
    }

    interface GreetingService {
        void printMessage(String message);
    }
}