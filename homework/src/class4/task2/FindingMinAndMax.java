package class4.task2;

import java.util.*;

public class FindingMinAndMax {
    private static final Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        System.out.println("How many integer numbers are supposed to be used? ");
        try {
            int size = Integer.parseInt(scanner.nextLine());
            if (size <= 0) {
                return;
            }

            List<Integer> numbers = new ArrayList<>(size);

            for (int i = 1; i <= size; i++) {
                System.out.print("Number " + i + " is ");
                numbers.add(Integer.parseInt(scanner.nextLine()));
            }

            System.out.println("\nMinimum value is " + NumberUtil.findMin(numbers));
            System.out.println("Maximum value is " + NumberUtil.findMax(numbers));
        } catch (NumberFormatException e) {
            System.out.println("The type of the input value has to be integer");
        }

    }
}
