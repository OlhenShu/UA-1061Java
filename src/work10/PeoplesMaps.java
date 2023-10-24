package work10;
import java.util.HashMap;
import java.util.Map;//

public class PeoplesMaps {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Jack", "Jacops");
        personMap.put("Garick", "Emy");
        personMap.put("Sara", "Danak");
        personMap.put("Okey", "Parent");
        personMap.put("Newson", "Mykle");
        personMap.put("Roy", "Olivia");
        personMap.put("Kator", "William");
        personMap.put("Mike", "Ava");
        personMap.put("Karen", "Orest");
        personMap.put("Klara", "Ignat");

        System.out.println("Initial Map:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        boolean hasDuplicateFirstName = personMap.values().stream().anyMatch(name -> name.equals("Orest"));

        if (hasDuplicateFirstName) {
            personMap.values().removeIf(name -> name.equals("Orest"));
        } else {
            System.out.println("No persons with the first name 'Orest' found.");
        }

        System.out.println("\nMap After Removal:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

