package ConditionStatements.Task4;

public enum CurrentSeason {
    WINTER("Winter exams"),
    SPRING("Second semester"),
    SUMMER("Summer holidays"),
    AUTUMN("Beginning of the academic year");

    private final String description;

    CurrentSeason (String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
