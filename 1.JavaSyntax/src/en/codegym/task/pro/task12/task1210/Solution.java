package en.codegym.task.pro.task12.task1210;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;

/* 
Flipping data
*/

public class Solution {
  public static ArrayList<Integer> numbers = new ArrayList<>(10);

  public static void main(String[] args) {
    init();
    print();
    reverse();
    print();
  }

  public static void init() {
    for (int i = 0; i < 10; i++) {
      numbers.add(i);
    }
  }

  public static void reverse() {
    int n = numbers.size() - 1;
    for (int i = 0; i < numbers.size() / 2; i++) {
      int temp = numbers.get(i);
      numbers.set(i, numbers.get(n - i));
      numbers.set(n - i, temp);
    }
    //Collections.reverse(numbers);  faster way based on course notes

  }

  private static void print() {
    for (int number : numbers) {
      System.out.println(number);
      //numbers.forEach(System.out::println); based on course notes
    }
  }
}
