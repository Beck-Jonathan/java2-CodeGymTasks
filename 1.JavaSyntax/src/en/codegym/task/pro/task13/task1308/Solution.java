package en.codegym.task.pro.task13.task1308;

import java.util.ArrayList;
import java.util.Collections;

/* 
Studying the methods of the Collections class. Part 3
*/

public class Solution {

    public static Integer min(ArrayList<Integer> list) {
        Integer minimum = Collections.min(list);
        return minimum;
    }

    public static Integer max(ArrayList<Integer> list) {
        Integer maximum = Collections.max(list);
        return maximum;
    }

    public static int frequency(ArrayList<Integer> list, Integer element) {

            int frequency = Collections.frequency(list, element);
            return frequency;
        }
    

    public static int binarySearch(ArrayList<Integer> list, Integer key) {
        int index=Collections.binarySearch(list,key);
        return index;
    }
}