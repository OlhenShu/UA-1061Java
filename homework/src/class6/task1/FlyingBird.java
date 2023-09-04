package class6.task1;

import java.util.EnumSet;
import java.util.stream.Collectors;

public abstract class FlyingBird extends Bird {
    public FlyingBird(EnumSet<Colour> feathersColours, boolean layEggs) throws IllegalArgumentException {
        super(feathersColours, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("This bird can fly");
    }

    @Override
    public String toString() {
        String combinationOfColours = getFeathersColours().stream()
                .map(o -> o.name().toLowerCase())
                .collect(Collectors.joining(", "));

        return "This is a nonflying bird which " + ((canLayEggs() ? "can" : "cannot") + "lay eggs. It has colours: " + combinationOfColours);
    }
}
