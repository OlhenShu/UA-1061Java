package Homework2;
import java.io.*;
import java.util.regex.Pattern;

public class main {
    public static void main(String[] args) {
        final Pattern fieldPattern = Pattern.compile(".*\\bpublic\\b.*;.*");
        final Pattern methodPattern = Pattern.compile(".*\\bpublic\\b.*\\(.*\\).*\\{.*");

        try (final BufferedReader reader = new BufferedReader(new FileReader("./homework16/src/homework2/code.txt"));
             final BufferedWriter writer = new BufferedWriter(new FileWriter("./homework16/src/homework2/result.txt"))) {
            final String[] lines = reader.lines().toArray(String[]::new);

            for (int i = 0; i < lines.length; i++) {
                if (fieldPattern.matcher(lines[i]).find()) {
                    lines[i] = lines[i].replace("public", "private");
                } else if (methodPattern.matcher(lines[i]).find()) {
                    lines[i] = lines[i].replace("public", "private");
                }
            }
            writer.write(String.join("\n", lines));
        } catch (IOException e) {
            System.out.println("Something went wrong while working files");
        }
    }


}
