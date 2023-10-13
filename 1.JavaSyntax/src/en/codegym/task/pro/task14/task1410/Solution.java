package en.codegym.task.pro.task14.task1410;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;

/*
Wrapping exceptions
*/

public class Solution {
  //Hey this passes code gym now, weird?
  public static void main(String[] args) {
    FileUtils.copyFile("book.txt", "book_final_copy.txt");
    //FileUtils.copyFile("book_final_copy.txt", "book_last_copy.txt");
  }

  //write your code here
}

