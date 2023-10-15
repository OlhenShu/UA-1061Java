package edu16.hw1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class App {
    private static String filesFolderPath = "curse/src/edu16/hw1/file/";

    public static void main(String[] args) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(getFilePath("file2.txt").toFile()))) {
            List<String> lines = Files.readAllLines(getFilePath("file1.txt"));
            Optional<String> longestLine = lines.stream().max(Comparator.comparing(String::length));
            writer.write("Number of lines in file1.txt: " + lines.size() + "\n");

            if (longestLine.isPresent()) {
                writer.write("The longest line in file1.txt.: " + longestLine.get() + "\n");
            }
            writer.write("Name: Vitali\n");
            writer.write("Birthday: 15.05.1983\n");
        } catch (IOException e) {
            throw new IOException();
        }
    }

    static protected Path getFilePath(String fileName) {
        return Path.of(filesFolderPath + fileName);
    }
}
