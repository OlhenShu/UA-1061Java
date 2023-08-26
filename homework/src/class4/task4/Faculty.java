package class4.task4;

import java.util.Objects;

public class Faculty {
    private int quantityOfStudents = 0;
    private Season season;

    public Faculty(Season season) throws IllegalArgumentException {
        if (Objects.isNull(season)) {
            throw new IllegalArgumentException("Season has to contain a value");
        }
        this.season = season;
    }

    public Faculty(int quantityOfStudents, Season season) throws IllegalArgumentException {
        if (quantityOfStudents < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        if (Objects.isNull(season)) {
            throw new IllegalArgumentException("Season has to contain a value");
        }
        this.quantityOfStudents = quantityOfStudents;
        this.season = season;
    }

    public void setQuantityOfStudents(int quantityOfStudents) throws IllegalArgumentException {
        if (quantityOfStudents < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        this.quantityOfStudents = quantityOfStudents;
    }

    public void setSeason(Season season) throws IllegalArgumentException {
        if (Objects.isNull(season)) {
            throw new IllegalArgumentException("Season has to contain a value");
        }
        this.season = season;
    }

    @Override
    public String toString() {
        return "Faculty has " + quantityOfStudents + " students. The current season is " + season;
    }
}
