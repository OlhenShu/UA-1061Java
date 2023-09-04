package class6.task1;

import java.util.EnumSet;

public class Eagle extends FlyingBird {
    public Eagle(EnumSet<Colour> feathersColours, boolean layEggs) throws IllegalArgumentException {
        super(feathersColours, layEggs);
    }
}
