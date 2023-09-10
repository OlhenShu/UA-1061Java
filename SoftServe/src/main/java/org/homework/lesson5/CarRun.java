package org.homework.lesson5;

import java.util.Scanner;

public class CarRun {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Type for First Car:");
        String type1  = scanner.nextLine();

        System.out.println("Enter Year of Production for First Car:");
        int yearOfProduction1  = scanner.nextInt();

        System.out.println("Enter Engine of Capability for First Car:");
        double engineCapability1  = scanner.nextDouble();

        System.out.println("Enter Type for Second Car:");
        String type2  = scanner.next();

        System.out.println("Enter Year of Production for Second Car:");
        int yearOfProduction2  = scanner.nextInt();

        System.out.println("Enter Engine of Capability for Second Car:");
        double engineCapability2  = scanner.nextDouble();

        System.out.println("Enter Type for Third Car:");
        String type3  = scanner.next();

        System.out.println("Enter Year of Production for Third Car:");
        int yearOfProduction3  = scanner.nextInt();

        System.out.println("Enter Engine of Capability for Third Car:");
        double engineCapability3  = scanner.nextDouble();

        System.out.println("Enter Type for Fourth Car:");
        String type4  = scanner.next();

        System.out.println("Enter Year of Production for Fourth Car:");
        int yearOfProduction4  = scanner.nextInt();

        System.out.println("Enter Engine of Capability for Fourth Car:");
        double engineCapability4  = scanner.nextDouble();

        Car car1 = new Car(type1, yearOfProduction1, engineCapability1);
        Car car2 = new Car(type2, yearOfProduction2, engineCapability2);
        Car car3 = new Car(type3, yearOfProduction3, engineCapability3);
        Car car4 = new Car(type4, yearOfProduction4, engineCapability4);

       int tmp;

        int[] arr = {car1.getYearOfProduction(), car2.getYearOfProduction(), car3.getYearOfProduction(), car4.getYearOfProduction()};

        for (int i = 0; i < arr.length - 1; i++ ) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]);

            scanner.close();
        }

    }

}
