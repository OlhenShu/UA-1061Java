package work17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ModifyJavaCode {

    public static void main(String[] args) {
        String inputFilePath = "input.java";
        String outputFilePath = "output.java";

        try {
            String modifiedCode = modifyJavaCode(inputFilePath);
            saveModifiedCode(outputFilePath, modifiedCode);
            System.out.println("Code modification completed successfully.");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static String modifyJavaCode(String filePath) throws IOException {
        StringBuilder modifiedCode = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll("\\bpublic\\b", "private");
                modifiedCode.append(line).append("\n");
            }
        }
        return modifiedCode.toString();
    }

    private static void saveModifiedCode(String filePath, String modifiedCode) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(modifiedCode);
        }
    }
}




