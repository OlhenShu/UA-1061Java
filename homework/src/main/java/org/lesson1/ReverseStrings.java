package src;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args){
   Scanner scanner = new Scanner(System.in);

   System.out.println("Enter first line:");
   String str1 = scanner.nextLine();

   System.out.println("Enter second line");
   String str2 = scanner.nextLine();

   System.out.println("Enter third line");
   String str3 = scanner.nextLine();

   //Strings output reverse order
        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str1);

        scanner.close();
    }

}

