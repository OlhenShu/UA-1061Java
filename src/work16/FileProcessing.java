package work16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileProcessing {

    public static void main(String[] args) {
        String inputFile = "file1.txt";
        String outputFile = "file2.txt";

        ArrayList<String> lines = readFromFile(inputFile);

        writeToFile(outputFile, lines.size(), findLongestLine(lines), "Maksym Kornenko", "12.03.2006");

        System.out.println("Tasks completed successfully.");
    }

    private static ArrayList<String> readFromFile(String filePath) {
        ArrayList<String> lines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines;
    }

    private static String findLongestLine(ArrayList<String> lines) {
        String longestLine = null;

        for (String line : lines) {
            if (longestLine == null || line.length() > longestLine.length()) {
                longestLine = line;
            }
        }

        return longestLine;
    }


    private static void writeToFile(String filePath, int numLines, String longestLine, String name, String birthday) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("Number of lines in file1.txt: " + numLines);
            bw.newLine();

            bw.write("Longest line in file1.txt: " + longestLine);
            bw.newLine();

            bw.write("Your Name: " + name);
            bw.newLine();
            bw.write("Your Birthday: " + birthday);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

