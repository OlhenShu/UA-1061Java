package ConditionStatements.Task5;

import java.util.Scanner;

public class DogManagement {
    public static void main(String[] args) {
        Dog [] dogs = new Dog[3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog();

            System.out.println("Enter the name of " + (i + 1)  + " dog:");
                dogs[i].setName(input.nextLine());

            System.out.println("Enter the breed of " + (i + 1) + " dog:");
                dogs[i].setBreed(input.nextLine());

            System.out.println("Enter the age of " + (i + 1) +" dog:");
                dogs[i].setAge(input.nextInt());

                input.nextLine();
        }



        for(Dog dog : dogs){
            Breed breed = Breed.getBreedInfo(dog.getBreed());

            System.out.println("The name of the dog: " + dog.getName());
            System.out.println("The breed of the dog: " + dog.getBreed());
            System.out.println(breed.getDescription());
            System.out.println("The age of the dog: " + dog.getAge());
            System.out.println();
        }

        IdenticalNames result = IdenticalNames.sameName(dogs);
        System.out.println(result.getCount());
        if(result.getCount() != 1)
            System.out.println("The name " + result.getSameName() + " - repeated " + result.getCount() + " times.");

    }
}
