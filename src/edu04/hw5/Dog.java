package edu04.hw5;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    static private Dog oldestDog;

    public Dog(String name, Breed breed, int age) {
        this.setName(name);
        this.setBreed(breed);
        this.setAge(age);

        if (oldestDog == null || age > oldestDog.getAge()) {
            setOldestDog(this);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Dog getOldestDog() {
        return oldestDog;
    }

    public static void setOldestDog(Dog oldestDog) {
        Dog.oldestDog = oldestDog;
    }

    @Override
    public String toString() {
        return "Oldest Dog is: " + getOldestDog().getName() + " " + getOldestDog().getBreed().getName() + " " + getOldestDog().getAge()
                + " years";
    }
}
