package en.codegym.task.pro.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Stacks at home
*/

public class MyStack {

    private final List<String> storage = new ArrayList<>();

    public void push(String s) {
       storage.add(0,s);
    }

    public String pop() {
        String reply = storage.get(0);
           storage.remove(0);
           return reply;
    }

    public String peek() {
        return  storage.get(0);
    }

    public boolean empty() {
        return (storage.size()==0);
    }

    public int search(String s) {
        return storage.indexOf(s);
    }
}
