package hometask2;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Shevchenko", "Ivan");
        personMap.put("Franko", "Taras");
        personMap.put("Betto Bardi", "Donatello");
        personMap.put("Buonarroti", "Michelangelo");
        personMap.put("Da Vinci", "Leonardo");
        personMap.put("Christie", "Agatha");
        personMap.put("Sanzio da Urbino", "Raffaello");
        personMap.put("Pendragon", "Arthur");
        personMap.put("Condon", "Edward");
        personMap.put("Conan Doyle", "Arthur");

        System.out.println(personMap);

        System.out.println(
                !hasDupValue(personMap)
                        ? "There are no duplicates in personMap."
                        : "There are at least two persons with the same name in personMap."
        );
        removeValue(personMap, "Ivan");

        System.out.println(personMap);

    }

    protected static boolean hasDupValue(Map<String, String> persons) {
        var tmpPersons = new HashMap<>();
        for (Map.Entry<String, String> person : persons.entrySet()) {
            if (tmpPersons.containsValue(person.getValue())) {
                return true;
            }
            tmpPersons.put(person.getKey(), person.getValue());
        }

        return false;
    }

    protected static <T>Map<T,T> removeValue(Map<T, T> persons, String valueToRemove) {
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