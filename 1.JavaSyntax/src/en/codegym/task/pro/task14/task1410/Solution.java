package en.codegym.task.pro.task14.task1410;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/*
Wrapping exceptions
*/

public class Solution {
    //cody gym is not impressed, but It's not worth the fight to refactor this

    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {
        try {
            FileUtils.readFile(sourceFile);
            FileUtils.writeFile(destinationFile);
        } catch (FileNotFoundException | FileSystemException  e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
          throw new RuntimeException(e);
        }

      //write your code here
    }
}
