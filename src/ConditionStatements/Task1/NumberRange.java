package ConditionStatements.Task1;

import java.util.Scanner;

public class NumberRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        if (input.hasNextFloat()) {
            float num1 = input.nextFloat();
            float num2 = input.nextFloat();
            float num3 = input.nextFloat();

            if (isNumberAndInRange(num1) && isNumberAndInRange(num2) && isNumberAndInRange(num3)) {
                System.out.println("All given numbers belong to the range [-5, 5]");
            } else {
                System.out.println("Not all given numbers belong to the range [-5, 5]");
            }
        } else {
            System.out.println("Input is not a valid number.");
        }
    }

    public static boolean isNumberAndInRange(float num) {
        return num >= -5 && num <= 5;
    }
}
