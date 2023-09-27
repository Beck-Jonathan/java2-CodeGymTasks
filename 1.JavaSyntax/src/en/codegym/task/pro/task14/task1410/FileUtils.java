package en.codegym.task.pro.task14.task1410;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FileUtils {
    //cody gym is not impressed, but It's not worth the fight to refactor this

    private static final String FILE_PATH = "1.JavaSyntax/src/main/resources/";
    private static Set<String> words = new TreeSet<>();

    public static void readFile(String fileName) throws FileNotFoundException, IOException {
        System.out.println("Reading the file contents: " + fileName);
        List<String> lines = Files.readAllLines(Paths.get(FILE_PATH + fileName));
        lines.forEach(line -> {
            System.out.println(line);
            String[] lineArr = line.trim().split(" ");
            for (String str : lineArr) {
                if (str.isEmpty()) {
                    continue;
                }
                //the regex says  "not" by using the carat ^, \\w- means word characters and not - characters
                String cleanWord = str.replaceAll("[^\\w-]", "").toLowerCase(); // matches any non-word char except dash/hyphen
                words.add(cleanWord);

            }
            words.forEach(System.out::println);
        });

    }

    public static void writeFile(String fileName) throws FileSystemException, FileNotFoundException {
        System.out.println("Writing data to the file: " + fileName);
        try (PrintWriter writer = new PrintWriter(new File(FILE_PATH + fileName))) {
            for (String word : words) {
                writer.println(word);
            }
        }
    }

    static void copyFile(String sourceFile, String destinationFile) {
        try {
            FileUtils.readFile(sourceFile);
            FileUtils.writeFile(destinationFile);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
