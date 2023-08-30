import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string");
        String str1= scanner.nextLine();

        System.out.println("Enter second string");
        String str2= scanner.nextLine();

        System.out.println("Enter third string");
        String str3= scanner.nextLine();

        System.out.println("Strings in reverse order");
        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str1);
        scanner.close();
    }
}
