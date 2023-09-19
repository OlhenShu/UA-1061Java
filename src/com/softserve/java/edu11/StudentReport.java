package com.softserve.java.edu11;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class StudentReport {
    public static void main(String[] args) {
        // Create a map to store information about students
        Map<String, Student> studentMap = new HashMap<>();

        studentMap.put("Adam", new Student("Adam", 20, 3.75));
        studentMap.put("Alice", new Student("Alice", 22, 3.90));
        studentMap.put("Bob", new Student("Bob", 21, 3.60));

        // Create a StringBuilder object for creating the report
        StringBuilder report = new StringBuilder();
        report.append("Student Report:\n");

        // Iterate through the students in the map and add their data to the report
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            String name = entry.getKey();
            Student student = entry.getValue();
            report.append("Name: ").append(name).append("\n");
            report.append("Age: ").append(student.age()).append(" years\n");
            report.append("Mark: ").append(student.mark()).append("\n\n");
        }

        // Print the report
        System.out.println(report);
        // Append additional information to the report
        appendLine(report, "Report generated on: ", getCurrentDate());

        // Delete the last separator line
        deleteLastSeparator(report);

        // Insert a header line at the beginning
        insertHeader(report, "Student Information");

        // Print the report
        System.out.println(report);
    }

    // A method to append a line with a prefix to the StringBuilder
    private static void appendLine(StringBuilder builder, String prefix, String value) {
        builder.append(prefix).append(value).append("\n");
    }

    // A method to append a separator line to the StringBuilder
    private static void appendSeparator(StringBuilder builder) {
        builder.append("------------------------------\n");
    }

    // A method to delete the last separator line from the StringBuilder
    private static void deleteLastSeparator(StringBuilder builder) {
        int lastSeparatorIndex = builder.lastIndexOf("***********\n");
        if (lastSeparatorIndex >= 0) {
            builder.delete(lastSeparatorIndex, builder.length());
        }
    }

    // A method to insert a header line at the beginning of the StringBuilder
    private static void insertHeader(StringBuilder builder, String header) {
        builder.insert(0, header + "\n\n");
    }

    private static String getCurrentDate() {
        return String.valueOf(LocalDate.now());
    }
}

record Student(String name, int age, double mark) {
}
