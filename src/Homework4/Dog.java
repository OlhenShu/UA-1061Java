package Homework4;
public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public enum Breed {
        RETRIEVER, BASSET, SHEPARD
    }

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Borys", Breed.RETRIEVER, 13);
        Dog dog2 = new Dog("Jule", Breed.BASSET, 8);
        Dog dog3 = new Dog("Gianfranco", Breed.SHEPARD, 4);

        if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) || dog2.getName().equals(dog3.getName())) {
            System.out.println("There are two or more dogs with the same name.");
        } else {
            Dog oldestDog = dog1;
            if (dog2.getAge() > oldestDog.getAge()) {
                oldestDog = dog2;
            }
            if (dog3.getAge() > oldestDog.getAge()) {
                oldestDog = dog3;
            }

            System.out.println("The name of the oldest dog is: " + oldestDog.getName());
            System.out.println("The breed of the oldest dog is: " + oldestDog.getBreed());
        }
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