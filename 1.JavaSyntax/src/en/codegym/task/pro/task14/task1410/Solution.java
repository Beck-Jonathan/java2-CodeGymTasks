package en.codegym.task.pro.task14.task1410;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/* 
Wrapping exceptions
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) throws IOException {
        FileUtils.readFile(sourceFile);
        FileUtils.writeFile(destinationFile);
        //write your code here
    }
}
