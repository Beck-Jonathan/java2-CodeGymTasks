package en.codegym.task.pro.task12.task1214;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Farewell, Pascal
*/

public class Solution {
  public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Pascal", "Python",
      "JavaScript", "Ruby", "Java", "Pascal", "Pascal"));

  public static void main(String[] args) {
    String find = "Pascal";
    //int x =programmingLanguages.lastIndexOf(find);
    //programmingLanguages.remove(x);
      //above are some scribbles that did not quite work, updates below based on class notes
    for (int i=programmingLanguages.size()-1; i > 0; i--) {
      if (programmingLanguages.get(i).equals(find)) {
        programmingLanguages.remove(i);
      }
    }
    programmingLanguages.forEach(System.out::println);

  }
}
