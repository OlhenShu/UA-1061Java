package edu04.practical;

import java.util.Scanner;

public class ContinentDeterminer {

    public enum Continent {
        EUROPE, ASIA, AFRICA, NORTH_AMERICA, SOUTH_AMERICA, ANTARCTICA, AUSTRALIA
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the country:");
        String country = scanner.nextLine().trim().toLowerCase();

        Continent continent = null;

        switch (country) {
            case "france":
            case "germany":
            case "ukraine":
                continent = Continent.EUROPE;
                break;
            case "china":
            case "india":
            case "japan":
                continent = Continent.ASIA;
                break;
            case "egypt":
            case "nigeria":
            case "south africa":
                continent = Continent.AFRICA;
                break;
            case "usa":
            case "canada":
            case "mexico":
                continent = Continent.NORTH_AMERICA;
                break;
            case "brazil":
            case "argentina":
            case "chile":
                continent = Continent.SOUTH_AMERICA;
                break;
            case "australia":
                continent = Continent.AUSTRALIA;
                break;
            // You can continue with more countries for other continents if needed.
            default:
                System.out.println("Sorry, the country was not recognized or not in the current list.");
                return;
        }

        System.out.println("The country belongs to: " + continent);
    }
}
