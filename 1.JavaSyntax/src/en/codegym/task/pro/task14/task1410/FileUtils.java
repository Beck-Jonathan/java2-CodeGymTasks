package en.codegym.task.pro.task14.task1410;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileUtils {
  //cody gym is not impressed, but It's not worth the fight to refactor this

  private static final String FILE_PATH = "1.JavaSyntax/src/main/resources/";
  private static final Set<String> words = new TreeSet<>();
  private static List<String> lines = new ArrayList<>();
  private static final String[] lineArr = lines.toArray(new String[0]);

  public static void readFile(String fileName) throws IOException {
    System.out.println("Reading the file contents: " + fileName);
    lines = Files.readAllLines(Paths.get(FILE_PATH + fileName));
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
    Map<String, Integer> map2 = new HashMap<String, Integer>();
    try (PrintWriter writer = new PrintWriter(new File(FILE_PATH + fileName))) {
      lines.forEach(line -> {
        System.out.println(line);
        String[] lineArr = line.trim().split(" ");
        for (String str : lineArr) {
          if (str.isEmpty()) {
            continue;
          }
          String cleanWord = str.replaceAll("[^\\w-]", "").toLowerCase();
          if (map2.containsKey(cleanWord)) {
            int val = map2.get(cleanWord);
            val++;
            map2.put(cleanWord, val);
          } else {
            map2.put(cleanWord, 1);
          }
        }
      }
      );
    }

    Map<String, Integer> topTen =
        map2.entrySet().stream()
            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
            .limit(10)
            .collect(Collectors.toMap(
                Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    int x = 4;
    for (String str : topTen.keySet()) {
      System.out.println("The word '" + str + "' appears " + topTen.get(str) + " times.");
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
