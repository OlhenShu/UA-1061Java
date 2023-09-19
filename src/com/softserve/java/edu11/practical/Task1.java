package com.softserve.java.edu11.practical;

public class Task1 {
    public static void main(String[] args) {
        String str1 = "SoftServe";
        String str2 = "SoftServe Academy";
        System.out.println(str2.contains(str1));
        System.out.println(str2.indexOf(str1));
// Task2
        String firstName = "Olha";
        String middleName = "Victorivna";
        String lastName = "Shutylieva";

        System.out.println(String.format("%s %c.%c.",
                lastName,
                firstName.charAt(0),
                middleName.charAt(0)));

    }
}
