package en.codegym.task.pro.task15.task1506;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Face control
*/
//not validating but it works so moving on.
public class Solution {
  private static final String FILE_PATH = "1.JavaSyntax/src/main/resources/";
  public static <Int> void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a file name: ");
    String fileName = scanner.nextLine();

    try {
      List<String> lines = Files.readAllLines(Paths.get(FILE_PATH + fileName));
      System.out.println(lines.size());
    } catch (IOException e) {
      System.out.println("Can not read this file");;
    }

    ArrayList<String> strings2;
    strings2 = (ArrayList<String>) Files.readAllLines(Path.of(FILE_PATH+fileName));

    ArrayList<Character> chars = new ArrayList<>();
    for (String s : strings2) {
      for (Integer x = 0; x < s.length(); x++) {
        Character dude = s.charAt(x);
        if (!dude.equals(' ')&&!dude.equals('.')&&!dude.equals(',')) {
        chars.add(s.charAt(x));
      }
    }
    for (Character c : chars) {

          System.out.print(c);
        }
    }
  }
}


