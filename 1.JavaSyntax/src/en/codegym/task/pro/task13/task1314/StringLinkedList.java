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
//man this is kind of ugly, but kind of organized? I mean I get it
    String result = "";
    Node pacer = first;
    //this starts at -1 because our first node is the starting blocker node with no index.
      //I understand why you started at 0. 
    int count = -1;
    if (first.next == null) {
      return null;
    } else {
      while (count < index) {
        if (pacer.next == null) {
          return null;
        }
        pacer = pacer.next;
        count++;

      }

      result = pacer.value;
      ;
    }
    return result;
  }

  public static class Node {
    private Node prev;
    private String value;
    private Node next;
  }
}
