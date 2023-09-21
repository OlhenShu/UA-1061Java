package com.softserve.java.edu12.practical;
//TODO
//To complete the given task, it is required to create a class named Plant which includes the following fields: int size, Color color (an Enum), Type type (an Enum)
//A constructor must be created to initialize these fields.
// The toString() method should be overridden to provide a string representation of the Plant object.
// Two separate classes named ColorException and TypeException should be created to describe all possible colors and types of plants respectively.
// In the main() method, an array of five plants should be created, and it should be ensured that the exception handling is working correctly for invalid color and type values.


enum Color {
    WHITE, RED, BLUE
}

enum Type {
    ROSE, TULIP, LILY
}

class ColorException extends Exception {
    public ColorException(String arg0) {
        super(arg0);
    }
}

class TypeException extends Exception {
    public TypeException(String arg0) {
        super(arg0);
    }
}

public class Plant {
    private final Type type;
    private final Color color;
    private final int size;

    public Plant(String type, String color, int size) throws ColorException, TypeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    private Color colorStrToEnum(String color) throws ColorException {
        return switch (color.toLowerCase()) {
            case "blue" -> Color.BLUE;
            case "red" -> Color.RED;
            case "white" -> Color.WHITE;
            default -> throw new ColorException("Input only color blue, red or white");
        };
    }

    private Type typeStrToEnum(String type) throws TypeException {
        return switch (type.toLowerCase()) {
            case "rose" -> Type.ROSE;
            case "tulip" -> Type.TULIP;
            case "lily" -> Type.LILY;
            default -> throw new TypeException("Input only type provided");
        };
    }

    @Override
    public String toString() {
        return "Plant{" +
                "type=" + type +
                ", color=" + color +
                ", size=" + size +
                '}';
    }


    public static void main(String[] args) {
        String[] types = {"sunflower", "tulip", "lily", "rose", "tulip",};
        String[] colors = {"green", "red", "green", "blue", "white",};
        int[] sizes = {5, 7, 4, 18, 22};

        for (int i = 0; i < 5; i++) {
            try {
                Plant pl = new Plant(types[i], colors[i], sizes[i]);
                System.out.println(pl);
            } catch (ColorException | TypeException e) {
                System.err.println(e.getMessage() + "\n");

            }
        }

    }

}

