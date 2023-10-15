package edu16.hw2;

import java.io.*;
import java.nio.file.Path;

public class App {
    private static String filesFolderPath = "curse/src/edu16/hw2/file/";

    public static void main(String[] args) throws IOException {
        String[] content;

        try (BufferedReader reader = new BufferedReader(new FileReader(getFilePath("original.txt").toFile()))) {
            content = reader.lines().toArray(String[]::new);
        } catch (IOException e) {
            throw new IOException();
        }

        saveResult(getPreparedText(content));
    }

    static protected Path getFilePath(String fileName) {
        return Path.of(filesFolderPath + fileName);
    }

    static protected String getPreparedText(String[] text) {
        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].replaceAll("\\bpublic\\b", "private");
        }

        return String.join("\n", text);
    }

    static protected void saveResult(String fileData) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(getFilePath("result.txt").toFile()))) {
            writer.write(fileData);
        } catch (IOException exception) {
            throw new IOException();
        }
    }
}
