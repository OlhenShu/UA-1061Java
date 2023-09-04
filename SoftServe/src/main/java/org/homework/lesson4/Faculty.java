package org.homework.lesson4;

public class Faculty {
    private int countOfStudents;
    private Season season;

    public Faculty(int countOfStudents, Season season) {
        this.countOfStudents = countOfStudents;
        this.season = season;
    }

    public int getCountOfStudents() {
        return countOfStudents;
    }

    public Season getSeason() {
        return season;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "countOfStudents=" + countOfStudents +
                ", season=" + season +
                '}';
    }
}