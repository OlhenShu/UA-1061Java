package ConditionStatements.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the error code: ");
        while (!input.hasNextInt()){
            System.out.println("The given value is not a number");
            input.next();
        }

        int inputError = input.nextInt();


        HTTPError numberOfError = getHTTPError(inputError);

        if(numberOfError != null)
            System.out.println(numberOfError.getDescription());
        else
            System.out.println("The base doesn't have that number within");


    }
    public static HTTPError getHTTPError(int errorCode) {
        return switch (errorCode) {
            case 400 -> HTTPError.ERROR400;
            case 401 ->  HTTPError.ERROR401;
            case 404 -> HTTPError.ERROR404;
            case 505 -> HTTPError.ERROR505;

            default -> null;

        };
    }
}
