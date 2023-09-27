package en.codegym.task.pro.task13.task1313;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement) != null) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node();
        node.value = value;
        if (first.next == null) {

            first.next = node;
            last.prev = node;
        }
        else {
        Node FirstNode = last.prev;
        node.next=FirstNode.next;
        FirstNode.next = node;
        node.prev = FirstNode;
        last.prev = node;}
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
