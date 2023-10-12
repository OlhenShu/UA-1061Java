package com.softserve.java.edu16;


//Prepare mytext.txt file with a lot of text inside.
//        Read context from file into array of strings.
//        Each array item contains one line from file.
//        Complete next tasks:
//        1) count and write the number of symbols in every line.
//        2) find the longest and the shortest line.
//        3) find and write only that lines, which consist of word «var»

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("mytext.txt"));

        int[] symbolsCounts = getNumberOfSymbolsInEveryLine(lines);
        for (int count : symbolsCounts) {
            System.out.println(count);
        }

        System.out.println("The shortest line: " + getShortestLine(lines));
        System.out.println("The longest line: " + getLongestLine(lines));
        System.out.println("Lines with var: " + getLinesWithVar(lines));

    }

    public static int[] getNumberOfSymbolsInEveryLine(List<String> lines) {
        int[] result = new int[lines.size()];

        for (int i = 0; i < lines.size(); i++) {
            result[i] = lines.get(i).length();
        }

        return result;
    }

    public static String getShortestLine(List<String> lines) {
        int minLength = Integer.MAX_VALUE;
        String shortestLine = null;

        for (String line : lines) {
            if (line.length() < minLength) {
                minLength = line.length();
                shortestLine = line;
            }
        }

        return shortestLine;
    }

    public static String getLongestLine(List<String> lines) {
        int maxLength = Integer.MIN_VALUE;
        String longestLine = null;

        for (String line : lines) {
            if (line.length() > maxLength) {
                maxLength = line.length();
                longestLine = line;
            }
        }

        return longestLine;
    }

    public static List<String> getLinesWithVar(List<String> lines) {
        List<String> result = new ArrayList<>();

        for (String line : lines) {
            String[] words = line.split("\\W+");
            for (String word : words) {
                if ("var".equals(word)) {
                    result.add(line);
                    break;
                }
            }
        }
        return result;
    }
}

