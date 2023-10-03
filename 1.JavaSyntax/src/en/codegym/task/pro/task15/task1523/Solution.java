package en.codegym.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/* 
Getting information through an API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://api.github.com/users/mlhaus");
        InputStream stream = url.openConnection().getInputStream();
        byte[] bytes = stream.readAllBytes();
        String json = new String(bytes);
        System.out.println(json);
    }
}

