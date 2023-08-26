package class4.task5;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Number 1 is to add a dog;");
            System.out.println("Number 2 is to show the oldest dogs;");
            System.out.println("Number 3 is to check if names of dogs repeat by name;");
            System.out.println("Number 0 is to exit");
            System.out.print("\nChoose an option, having input a value: ");


            switch (scanner.nextLine()) {
                case "1" -> {
                    System.out.println("\tEnter necessary data for dog: ");

                    System.out.print("\tName is ");
                    final String name = scanner.nextLine();
                    System.out.print("\tBreed is ");
                    final String breed = scanner.nextLine();
                    System.out.print("\tAge is ");

                    try {
                        final int age = Integer.parseInt(scanner.nextLine());
                        final Dog dog = new Dog(name, Breed.get(breed), age);
                        System.out.println("\tDog with the name ".concat(dog.getName()).concat(" created!\n"));
                    } catch (NumberFormatException e) {
                        System.out.println("\tThe type of age has to be integer\n");
                    } catch (IllegalArgumentException e) {
                        System.out.println("\t" + e.getMessage() + "\n");
                    }
                }
                case "2" -> {
                    Dog.displayTheOldest();
                    System.out.println();
                }
                case "3" -> {
                    if (Dog.checkIfNameRepeats()) {
                        System.out.println("\tThere are dogs with the name which repeats\n");
                    } else {
                        System.out.println("\tThere are not dogs with the name which repeats\n");
                    }
                }
                case "0" -> {
                    return;
                }
                default -> System.out.println("There is no such an option\n");
            }
        }

    }
}
