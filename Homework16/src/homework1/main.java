package homework1;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
public class main {
    public static void main(String[] args) {
        final Path file1Path = Path.of("./src/homework1/file1.txt");
        final Path file2Path = Path.of("./src/homework1/file2.txt");
        final String Name = "Stefan-Bohdan";
        final LocalDate Birthday = LocalDate.of(2004, 6, 26);

        try (final BufferedWriter writer = new BufferedWriter(new FileWriter(file2Path.toFile()))) {
            final List<String> lines = Files.readAllLines(file1Path);
            final Optional<String> longestLine = lines.stream()
                    .max(Comparator.comparing(String::length));

            writer.write("Number of lines in file1.txt: " + lines.size() + "\n");
            if (longestLine.isPresent()) {
                writer.write("Longest line in file1.txt: " + longestLine.get() + "\n");
            }
            writer.write("My name: " + Name + ". My birthday: " +
                    Birthday.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + "\n");
        } catch (IOException e) {
            System.out.println("Something went wrong during work with your file");
        }
    }
}