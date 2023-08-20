package class1.task1;

public class Circle {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius is supposed to be greater than 0");
        } else {
            this.radius = radius;
        }
    }

    public double findArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double findCircumference() {
        return 2 * Math.PI * radius;
    }
}
