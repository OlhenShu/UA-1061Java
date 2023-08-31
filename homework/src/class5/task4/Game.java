package class5.task4;

import java.util.Scanner;

public class Game {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("You have to find out what the random integer number is!");
        int quantity;
        int randomNumber;
        int inputNumber;
        String response;
        int count;

        do {
            count = 0;
            System.out.print("Write how many numbers you would like to deal with: ");

            try {
                quantity = Integer.parseInt(scanner.nextLine());
                if (quantity <= 0) {
                    throw new IllegalArgumentException("Quantity of numbers has to be greater than 0");
                }
                System.out.println("The range of integer numbers is [0; " + quantity + ")");
                randomNumber = Randomizer.getNumber(quantity);

                do {
                    System.out.print("The number you think is ");
                    inputNumber = Integer.parseInt(scanner.nextLine());
                    count+=1;
                    if (inputNumber > randomNumber) {
                        System.out.println("Too high, try again");
                    } else if (inputNumber < randomNumber) {
                        System.out.println("Too low, try again");
                    } else {
                        System.out.println("You guessed!");
                        break;
                    }
                } while (true);
                System.out.println(count + " attempts\n");

            } catch (NumberFormatException e) {
                System.out.println("You have entered a wrong number. It doesn't fit the appropriate format\n");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage().concat("\n"));
            } finally {
                System.out.println("Do you desire to keep playing? Enter 'Y' or 'y' if you want to continue: ");
                response = scanner.nextLine();
                System.out.println();
            }
        } while (response.equalsIgnoreCase("Y"));
    }
}
