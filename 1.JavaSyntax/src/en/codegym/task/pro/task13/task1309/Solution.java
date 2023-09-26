package en.codegym.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Student performance
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Alex",102.4);
        grades.put("Mike",33.0);
        grades.put("Jonny",45.0);
        grades.put("Liz",44.22);
        grades.put("x",122.2);
        
    }
}
