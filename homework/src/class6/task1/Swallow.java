package class6.task1;

import java.util.EnumSet;

public class Swallow extends FlyingBird {
    public Swallow(EnumSet<Colour> feathersColours, boolean layEggs) throws IllegalArgumentException {
        super(feathersColours, layEggs);
    }
}
