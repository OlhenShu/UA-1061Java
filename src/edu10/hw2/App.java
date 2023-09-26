package edu10.hw2;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Liutyi", "Orest");
        personMap.put("Bulba", "Taras");
        personMap.put("Abelson", "Philip");
        personMap.put("Oppenheimer", "Robert");
        personMap.put("Agnew", "Harold");
        personMap.put("Christ", "Carl");
        personMap.put("French", "Anthony");
        personMap.put("Compton", "Arthur");
        personMap.put("Condon", "Edward");
        personMap.put("Adamson", "Arthur");

        System.out.println(personMap);

        System.out.println(
                !hasDuplicateValues(personMap)
                        ? "There are no duplicates in personMap."
                        : "There are at least two persons with the same name in personMap."
        );
        removeByValue(personMap, "Orest");

        System.out.println(personMap);

    }

    protected static boolean hasDuplicateValues(Map<String, String> persons) {
        var tmpPersons = new HashMap<>();
        for (Map.Entry<String, String> person : persons.entrySet()) {
            if (tmpPersons.containsValue(person.getValue())) {
                return true;
            }
            tmpPersons.put(person.getKey(), person.getValue());
        }

        return false;
    }

    protected static <T>Map<T,T> removeByValue(Map<T, T> persons, String valueToRemove) {
        if (!persons.containsValue(valueToRemove)) {
            return persons;
        }

        for (Map.Entry<T, T> person : persons.entrySet()) {
            if (person.getValue() == valueToRemove) {
                persons.remove(person.getKey());
                break;
            }
        }

        return persons;
    }
}
