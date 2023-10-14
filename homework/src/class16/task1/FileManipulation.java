package class16.task1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FileManipulation {
    public static void main(String[] args) {
        final Path file1Path = Path.of("./src/class16/task1/files/file1.txt");
        final Path file2Path = Path.of("./src/class16/task1/files/file2.txt");
        final String myName = "Vitalii";
        final LocalDate myBirthday = LocalDate.of(2004, 6, 26);

        try (final BufferedWriter writer = new BufferedWriter(new FileWriter(file2Path.toFile()))) {
            final List<String> lines = Files.readAllLines(file1Path);
            final Optional<String> longestLine = lines.stream()
                    .max(Comparator.comparing(String::length));

            writer.write("Number of lines in file1.txt: " + lines.size() + "\n");
            if (longestLine.isPresent()) {
                writer.write("Longest line in file1.txt: " + longestLine.get() + "\n");
            }
            writer.write("My name is " + myName + ". My birthday is " +
                    myBirthday.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + "\n");
        } catch (IOException e) {
            System.out.println("Something went wrong during while working with the files");
        }
    }
}
