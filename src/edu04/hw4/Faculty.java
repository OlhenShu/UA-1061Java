package edu04.hw4;

public class Faculty {
    static private int countOfStudents;
    static private Season currentSeason;

    public Faculty(Season season, int count) {
        setCurrentSeason(season);
        setCountOfStudents(count);
    }

    public static int getCountOfStudents() {
        return countOfStudents;
    }

    public static void setCountOfStudents(int countOfStudents) {
        Faculty.countOfStudents = countOfStudents;
    }

    public static Season getCurrentSeason() {
        return currentSeason;
    }

    public static void setCurrentSeason(Season currentSeason) {
        Faculty.currentSeason = currentSeason;
    }
}
