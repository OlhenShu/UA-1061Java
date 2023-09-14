import java.util.Scanner;

public class UserInfo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String name;
            String address;


            System.out.print("What is your name?\n");
            name = scanner.nextLine();

            System.out.print("Where do you live, " + name + "? \n");
            address = scanner.nextLine();

            System.out.println("Name: " + name);
            System.out.println("Address: " + address);

            scanner.close();

        }
}
