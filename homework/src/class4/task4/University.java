package class4.task4;

import java.util.Scanner;

public class University {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try{
            System.out.println("Creating a faculty for the university!");
            System.out.println("How many students belong to the faculty?");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.println("What time of year?");
            String season = scanner.nextLine();

            Faculty faculty = new Faculty(quantity, Season.get(season));
            System.out.println(faculty);
        } catch (NumberFormatException e) {
            System.out.println("The type of quantity has to be integer");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
