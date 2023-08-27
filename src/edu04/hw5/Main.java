package edu04.hw5;

public class Main {
    public static void main(String[] args) {
        Dog firstDog = new Dog("dog1", Breed.BULLDOG, 2);
        Dog secondDog = new Dog("dog2", Breed.ROTTWEILER, 7);
        Dog thirdDog = new Dog("dog3", Breed.POODLE, 75);

        if ((firstDog.getName() == secondDog.getName())
                || (firstDog.getName() == thirdDog.getName())
                || (secondDog.getName() == thirdDog.getName())) {
            System.out.println("There are at least 2 dogs with the same name.");
        }

        System.out.println(Dog.getOldestDog());
    }
}
