package en.codegym.task.pro.task12.task1212;

/* 
Creating our own list
*/

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        String[] backup = new String[capacity];
        for (int i=0;i< elements.length;i++){
            backup[i] = elements[i];

        }
        int old_capacity = capacity;
        capacity= (int) (capacity*1.5);
        elements = new String[capacity];
        for (int i =0;i<old_capacity;i++){
            elements[i]=backup[i];

        }

    }

}
