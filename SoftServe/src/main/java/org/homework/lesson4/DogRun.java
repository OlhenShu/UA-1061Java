package org.homework.lesson4;

import java.util.Scanner;

public class DogRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first Name:");
        String name1 = scanner.next();

        System.out.println("Input first Breed:");
        String breed1 = scanner.next();

        System.out.println("Input first Age:");
        int age1 = scanner.nextInt();

        Dog dog1 = new Dog(name1, Breed.valueOf(breed1), age1);

        System.out.println("Input second Name:");
        String name2 = scanner.next();

        System.out.println("Input second Breed:");
        String breed2 = scanner.next();

        System.out.println("Input second Age:");
        int age2 = scanner.nextInt();

        Dog dog2 = new Dog(name2, Breed.valueOf(breed2), age2);

        System.out.println("Input third Name:");
        String name3 = scanner.next();

        System.out.println("Input third Breed:");
        String breed3 = scanner.next();

        System.out.println("Input third Age:");
        int age3 = scanner.nextInt();

        Dog dog3 = new Dog(name3, Breed.valueOf(breed3), age3);

        String resultName;

        if (dog1.getName().equals(dog2.getName())) {
            resultName = dog2.getName();
        } else if (dog1.getName().equals(dog3.getName())) {
            resultName = dog3.getName();
        } else if (dog2.getName().equals(dog3.getName())) {
            resultName = dog2.getName();
        } else {
            resultName = null;
        }

        System.out.println("Name Dublicat:" + resultName);

        Integer resultOld;

        if (dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
            resultOld = dog1.getAge();
        } else if (dog2.getAge() > dog3.getAge()) {
            resultOld = dog2.getAge();
        } else {
            resultOld = dog3.getAge();
        }

        System.out.println("Old Dog:" + resultOld);

    }
}






