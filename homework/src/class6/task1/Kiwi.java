package class6.task1;

import java.util.EnumSet;

public class Kiwi extends NonflyingBird {
    public Kiwi(EnumSet<Colour> feathersColours, boolean layEggs) throws IllegalArgumentException {
        super(feathersColours, layEggs);
    }
}