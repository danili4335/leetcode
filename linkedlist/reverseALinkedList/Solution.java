package linkedlist.reverseALinkedList;

public class Solution {
  static Node head;

  static class Node {
    int data;
    Node next;

    Node(int d) {
      data = d;
      next = null;
    }
  }

  Node reverse(Node node) {
    Node prev = null;
    Node curr = node;
    Node next = null;

    while(curr != null) {
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    
    return prev;
  }

  void printReverse(Node node) {
    while(node != null) {
      System.out.print(node.data + "->");
      node = node.next;
    }

    System.out.println();
  }

  public static void main(String arg[]) {
    Solution list = new Solution();
    list.head = new Node(1);
    list.head.next = new Node(2);
    list.head.next.next = new Node(3);
    list.head.next.next.next = new Node(4);

    list.printReverse(head);
    head = list.reverse(head);
    list.printReverse(head);
  }  
}
