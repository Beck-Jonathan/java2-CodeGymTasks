package en.codegym.task.pro.task15.task1501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Shortening try
*/

public class Solution {
    public static void main(String[] args) {
        //has to be a closeable object in the try with resources bit.
        //we are going to use a java connection class
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){

            String line = reader.readLine();
            System.out.println(line.toLowerCase());
            
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}
