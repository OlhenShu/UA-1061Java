package com.softserve.java.edu08;

public class OuterClass {
    private static int age = 10;
    private int number = 20;
    static class StaticNestedClass{
        private int nestedField = 15;
        public void print(){
            System.out.println("Outer Static Field" + age);
        //    System.out.println("Outer NonStatic Field" + number);
        }

        public static void main(String[] args) {
            OuterClass.StaticNestedClass nestedObj = new OuterClass.StaticNestedClass();
            nestedObj.print();
        }
    }
}
