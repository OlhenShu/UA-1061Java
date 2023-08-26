package class4.task1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class WithinLineSegment {
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("You have to input 3 numbers, type of which is float\n");
        List<Float> list = new ArrayList<>();

        try {
            for (int i = 1; i <= 3; i++) {
                System.out.print("Number " + i + " is ");
                list.add(scanner.nextFloat());
            }

            boolean isWithinLineSegment = list.stream().allMatch(o -> Math.abs(o) <= 5);
            if (isWithinLineSegment) {
                System.out.println("The three numbers is within the line segment [-5; 5]");
            } else {
                System.out.println("At least one of the three numbers is out of the line segment [-5; 5]");
            }
        } catch (InputMismatchException e) {
            System.out.println("Format of number is not right");
        }
    }
}
