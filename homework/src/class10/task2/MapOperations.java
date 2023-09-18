package class10.task2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapOperations {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();
        personMap.put("Kosheluk", "Adriana");
        personMap.put("Patel", "Olivia");
        personMap.put("Jones", "Henry");
        personMap.put("Ginnity", "Jordyn");
        personMap.put("Lee", "Mia");
        personMap.put("Cyrus", "Noah");
        personMap.put("Tompson", "Sarah");
        personMap.put("Anderson", "Mia");
        personMap.put("Smith", "Tim");
        personMap.put("Kyryliv", "Andriy");

        personMap.forEach((key, value) -> System.out.println("LN: " + key + "; FN: " + value));

        if (personMap.size() != new HashSet<>(personMap.values()).size()) {
            System.out.println("\nThere are people with the same name");
        } else {
            System.out.println("\nThere are not people with the same name");
        }

        System.out.println("\nRemoving people with the first name Mia");
        personMap.entrySet().removeIf(o -> o.getValue().equals("Mia"));
        personMap.forEach((key, value) -> System.out.println("LN: " + key + "; FN: " + value));
        if (personMap.size() != new HashSet<>(personMap.values()).size()) {
            System.out.println("\nThere are people with the same name");
        } else {
            System.out.println("\nThere are not people with the same name");
        }
    }
}
