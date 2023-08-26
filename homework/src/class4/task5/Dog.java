package class4.task5;

import java.util.*;

public class Dog {
    private final static List<Dog> dogs;
    private final static List<Dog> oldestOnes;
    private final static Map<String, Integer> quantityOfUniqueNames;
    private String name;
    private Breed breed;
    private int age;

    static {
        dogs = new ArrayList<>();
        oldestOnes = new ArrayList<>();
        quantityOfUniqueNames = new HashMap<>();
    }

    public Dog(String name, Breed breed, int age) throws IllegalArgumentException {
        if (Objects.isNull(name)) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        if (Objects.isNull(breed)) {
            throw new IllegalArgumentException("Breed cannot be null");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age should be zero or positive");
        }
        this.name = name;
        this.breed = breed;
        this.age = age;

        add(this);
        isTheOldest(this);
    }

    private void add(Dog dog) {
        dogs.add(dog);
        quantityOfUniqueNames.merge(dog.name, 1, Integer::sum);
    }

    private void isTheOldest(Dog dog) {
        if (oldestOnes.isEmpty()) {
            oldestOnes.add(dog);
            return;
        } else if (oldestOnes.stream().allMatch(o -> o.age == dog.age)) {
            oldestOnes.add(dog);
            return;
        }

        final Dog dogFromTheOldest = oldestOnes.get(0);
        if (dogFromTheOldest.age < dog.age) {
            oldestOnes.clear();
            oldestOnes.add(dog);
        }
    }

    public static void displayTheOldest() {
        if (oldestOnes.isEmpty()) {
            System.out.println("\tThere is no data");
        } else {
            oldestOnes.forEach((o) -> {
                System.out.println("\tName is %s and its breed %s".formatted(o.name, o.breed.name()));
            });
        }
    }

    public static boolean checkIfNameRepeats() {
        return quantityOfUniqueNames.entrySet().stream()
                .anyMatch(o -> o.getValue() > 1);
    }

    public String getName() {
        return name;
    }
}
