package class6.task1;

import java.util.EnumSet;
import java.util.Objects;

public abstract class Bird {
    private final EnumSet<Colour> feathersColours;
    boolean layEggs; //depends on gender

    public Bird(EnumSet<Colour> feathersColours, boolean layEggs) throws IllegalArgumentException {
        if (Objects.isNull(feathersColours)) {
            throw new IllegalArgumentException("Feather colours are supposed to be");
        }
        this.feathersColours = feathersColours;
        this.layEggs = layEggs;
    }

    public EnumSet<Colour> getFeathersColours() {
        return feathersColours;
    }

    public boolean canLayEggs() {
        return layEggs;
    }

    public abstract void fly();
}
