package class4.task5;

import java.util.Arrays;

public enum Breed {
    BULLDOG,
    CHIHUAHUA,
    POODLE,
    ROTTWEILER,
    ITALIAN_GREYHOUND;

    public static Breed get(String name) throws IllegalArgumentException{
        return Arrays.stream(Breed.values())
                .filter(o -> o.name().equals(name.toUpperCase()))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Breed not found by name"));
    }
}
