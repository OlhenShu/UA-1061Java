package class4.task4;

import java.util.Arrays;

public enum Season {
    WINTER,
    SPRING,
    SUMMER,
    AUTUMN;

    public static Season get(String value) {
        return Arrays.stream(Season.values())
                .filter(o -> o.name().equals(value.toUpperCase()))
                .findAny().orElseThrow(() -> new IllegalArgumentException("There is not such a season"));
    }
}
