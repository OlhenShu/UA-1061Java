package edu03.hw2;

import edu03.Helper;

public class Minimum {
    public static void main(String[] args) {
        int first = Helper.getEnteredIntNumber("Input the first number:");
        int second = Helper.getEnteredIntNumber("Input the second number:");
        int third = Helper.getEnteredIntNumber("Input the third number:");
        int smallest;

        smallest = Math.min(first, second);
        smallest = Math.min(smallest, third);

        System.out.println("The smallest number is " + smallest);
    }
}
