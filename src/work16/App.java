package work16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {

    public static void main(String[] args) {
        String inputFile = "YourJavaFile.java";  // Replace with the correct file name or path
        String outputFile = "OutputFile.java";

        try {
            modifyJavaCode(inputFile, outputFile);
            System.out.println("Code modification completed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error modifying Java code: " + e.getMessage());
        }
    }

    private static void modifyJavaCode(String inputFilePath, String outputFilePath) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            while ((line = br.readLine()) != null) {
                line = line.replaceAll("\\bpublic\\b", "private");
                bw.write(line);
                bw.newLine();
            }

        }
    }
}


