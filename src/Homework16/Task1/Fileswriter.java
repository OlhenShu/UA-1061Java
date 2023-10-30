package Homework16.Task1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Fileswriter {
    public static void main(String[] args) {
        final Path file1Path = Path.of("/home/yar/project/UA-1061Java/src/Homework16/file1.txt");
        final Path file2Path = Path.of("/home/yar/project/UA-1061Java/src/Homework16/file2.txt");
        final String Name = "Yaroslav";
        final LocalDate Birthday = LocalDate.of(1988, 8, 29);

        try (final BufferedWriter writer = new BufferedWriter(new FileWriter(file2Path.toFile()))) {
            final List<String> lines = Files.readAllLines(file1Path);
            final Optional<String> longestLine = lines.stream()
                    .max(Comparator.comparing(String::length));

            writer.write("Number of lines in file1.txt: " + lines.size() + "\n");
            if (longestLine.isPresent()) {
                writer.write("Longest line in file1.txt: " + longestLine.get() + "\n");
            }
            writer.write("Your name: " + Name + ". Your birthday date: " +
                    Birthday.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + "\n");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Something went wrong while working with files");
        }
    }
}