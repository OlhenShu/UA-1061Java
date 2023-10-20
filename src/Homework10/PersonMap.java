package Homework10;

import java.util.HashMap;
import java.util.Map;

public class PersonMap {
    public static void main(String[] args) {
        // Create a map with ten entries of type <String, String>
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Shpak", "John");
        personMap.put("Musk", "Ivan");
        personMap.put("Schumacher", "Michael");
        personMap.put("Boleyn", "Anna");
        personMap.put("Garcia", "Orest");
        personMap.put("Sijimura", "Takada");
        personMap.put("Orestenko", "Orest");
        personMap.put("Mysha", "Jazek");
        personMap.put("Cat", "Borys");
        personMap.put("Milestonenko", "Orest");

        // Display the contents of the map
        System.out.println("Contents of the personMap:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Check if there are at least two persons with the same first name
        boolean hasDuplicateFirstName = checkDuplicateFirstName(personMap, "Orest");
        System.out.println("At least two persons with the same first name: " + hasDuplicateFirstName);

        // Remove the person with the specified first name (e.g., "Orest")
        removePersonWithFirstName(personMap, "Orest");

        // Print the resulting map after the removal
        System.out.println("Contents of the personMap after removal:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method to check if there are at least two persons with the same first name
    private static boolean checkDuplicateFirstName(Map<String, String> map, String firstNameToCheck) {
        int count = 0;
        for (String firstName : map.values()) {
            if (firstName.equals(firstNameToCheck)) {
                count++;
                if (count >= 2) {
                    return true;
                }
            }
        }
        return false;
    }

    // Method to remove a person with the specified first name
    private static void removePersonWithFirstName(Map<String, String> map, String firstNameToRemove) {
        map.values().removeIf(firstNameToRemove::equals);
    }
}