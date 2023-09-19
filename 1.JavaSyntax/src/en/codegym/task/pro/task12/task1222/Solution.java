package en.codegym.task.pro.task12.task1222;

import java.util.ArrayList;

/* 
Displaying different types on the console
*/

public class Solution {

    public static void printAnything(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<Object>();
        arrayList.add(15);
        arrayList.add("Hello");
        arrayList.add(154);
        arrayList.add("string");

        printAnything(arrayList);
    }
}
