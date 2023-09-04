package class6.task1;

import java.util.EnumSet;

public class Penguin extends NonflyingBird {
    public Penguin(EnumSet<Colour> feathersColours, boolean layEggs) throws IllegalArgumentException {
        super(feathersColours, layEggs);
    }
}
