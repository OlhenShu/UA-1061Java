package com.softserve.java.edu16;

import java.io.FileOutputStream;
import java.io.IOException;

public class TestFile {
    public static void main(String[] args) {
        byte[] w = {48, 49, 50};
        String fileName = "test.txt";
        try (FileOutputStream outFile = new FileOutputStream(fileName)) {
            System.out.println("Output file was opened.");
            outFile.write(w);
            System.out.println("Saved: " + w.length + " bytes.");
            System.out.println("Output stream was closed.");
        } catch (IOException e) {
            System.out.println("File Write Error: " + fileName);
        }
    }
}