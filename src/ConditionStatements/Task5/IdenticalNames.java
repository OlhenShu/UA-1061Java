package ConditionStatements.Task5;

import java.util.HashMap;

public class IdenticalNames {

    private String sameName;
    private int count;
    public IdenticalNames(String sameName, int count){
        this.sameName = sameName;
        this.count = count;
    }

    public String getSameName() {
        return sameName;
    }

    public int getCount() {
        return count;
    }

    public static IdenticalNames sameName(Dog [] dogs){
        HashMap<String, Integer> nameCounts = new HashMap<>();
        String mostRepeatedName = null;
        int maxCount = 0;

        for (Dog dog : dogs) {
            String name = dog.getName();
            int count = nameCounts.getOrDefault(name, 0) + 1;
            nameCounts.put(name, count);

            if (count > maxCount) {
                maxCount = count;
                mostRepeatedName = name;
            }
        }

        return new IdenticalNames(mostRepeatedName, maxCount);
    }
}
