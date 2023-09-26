package com.softserve.java.edu13;

@FunctionalInterface
interface MyFunctionalInterface {
    void myAbstractMethod(); // Абстрактний метод
    
    default void myDefaultMethod() {
        System.out.println("This is a default method");
    }
    
    static void myStaticMethod() {
        System.out.println("This is a static method");
    }
}

public class Main {
    public static void main(String[] args) {
        MyFunctionalInterface myFunc = () -> System.out.println("Implementing abstract method using lambda");
        
        myFunc.myAbstractMethod(); // Виклик лямбда-виразу
        myFunc.myDefaultMethod(); // Виклик дефолтного методу
        MyFunctionalInterface.myStaticMethod(); // Виклик статичного методу
    }
}
