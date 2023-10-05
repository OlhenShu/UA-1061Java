package work04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

enum Breed {
    LABRADOR, PUG, GOLDEN_RETRIEVER, BULLDOG, BEAGLE, CHIHUAHUA, GERMAN_SHEPHERD, THAI_RIDGEBACK, SPITZ;
}

class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", Breed.LABRADOR, 3);
        Dog dog2 = new Dog("Max", Breed.THAI_RIDGEBACK, 5);
        Dog dog3 = new Dog("Charlie", Breed.BULLDOG, 4);

        List<String> dogNames = new ArrayList<>();
        dogNames.add(dog1.getName());
        dogNames.add(dog2.getName());
        dogNames.add(dog3.getName());

        if (hasDuplicateNames(dogNames)) {
            System.out.println("Two or more dogs have the same name.");
        } else {
            List<Dog> dogs = new ArrayList<>();
            dogs.add(dog1);
            dogs.add(dog2);
            dogs.add(dog3);

            Dog oldestDog = Collections.max(dogs, (d1, d2) -> Integer.compare(d1.getAge(), d2.getAge()));

            System.out.println("The oldest dog is " + oldestDog.getName() + " and its breed is " + oldestDog.getBreed());
        }
    }

    private static boolean hasDuplicateNames(List<String> names) {
        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                if (names.get(i).equals(names.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }
}
