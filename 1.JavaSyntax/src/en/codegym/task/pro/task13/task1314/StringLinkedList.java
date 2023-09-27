package en.codegym.task.pro.task13.task1314;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
        if (first.next == null) {
            Node node = new Node();
            node.value = value;
            first.next = node;
        }
        if (last.prev == null) {
            last.prev = first.next;
            return;
        }

        Node node = new Node();
        node.value = value;

        Node lastNode = last.prev;
        lastNode.next = node;
        node.prev = lastNode;
        last.prev = node;
    }

    public String get(int index) {
        int count=-1;
        String result="";
        Node pacer = first;
        if (first.next == null){ return null;}
        else{
            while (count < index){
                if (pacer.next==null){
                    return null;
                }
                pacer=pacer.next;
                count++;

            }

            result= pacer.value;;
        }
        return result;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
