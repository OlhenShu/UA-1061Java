package class6.task1;

public enum Colour {
    YELLOW(0),
    RED(1),
    GREEN(2),
    BLUE(3),
    GRAY(4),
    BROWN(5),
    BLACK(6),
    WHITE(7);

    private final int colourCode;

    Colour(int colourCode) {
        this.colourCode = colourCode;
    }

    public int getColourCode() {
        return colourCode;
    }
}
