package en.codegym.task.pro.task15.task1507;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Not all shall pass
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner bananer = new Scanner(System.in);
        String filepath = bananer.nextLine();
        ArrayList<String> strings2 = new ArrayList<String>();
        strings2 = (ArrayList<String>) Files.readAllLines(Path.of(filepath));
        int count = 0;
        for (count=0;count<strings2.size();count++){
            if (count%2==0){
                System.out.println(strings2.get(count));
            }

        }
    }
}

