package Homework16.Task2;


import java.io.*;

public class Main {
    private static String filePath = "/home/yar/project/UA-1061Java/src/Homework16/Task2/input.txt";

    public static void main(String[] args) throws IOException {
        String[] content;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            content = reader.lines().toArray(String[]::new);
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException(e);
        }

        String preparedText = getPreparedText(content);
        saveResult(preparedText);
    }

    static protected String getPreparedText(String[] text) {
        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].replaceAll("\\bpublic\\b", "private");
        }

        return String.join("\n", text);
    }

    static protected void saveResult(String fileData) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/home/yar/project/UA-1061Java/src/Homework16/Task2/output.txt"))) {
            writer.write(fileData);
        } catch (IOException exception) {
            throw new IOException();
        }
    }
}

