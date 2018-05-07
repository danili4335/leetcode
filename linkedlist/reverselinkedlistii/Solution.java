package linkedlist.reverselinkedlistii;

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

  Node reverseBetween(Node node, int m, int n) {
    //create a dummy node ahead of linked list
    Node dummy = new Node(0);
    dummy.next = head;
    head = dummy;

    for(int i = 1; i < m; i++) {
      if(head == null){
        return null;
      }
      head = head.next;
    }
    
    Node prevMNode = head;
    Node mNode = head.next;
    Node nNode = mNode;
    Node postNNode = nNode.next;
    Node next = null;

    for(int i = m; i < n; i++) {
      if(postNNode == null) {
        return null;
      }
      next = postNNode.next;
      postNNode.next = nNode;
      nNode = postNNode;
      postNNode = next;
    }
    prevMNode.next = nNode;
    mNode.next = postNNode;
    
    return dummy.next;
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
    list.head.next.next.next.next = new Node(5);

    list.printReverse(head);
    head = list.reverseBetween(head, 2, 4);
    list.printReverse(head);
  }  
}
