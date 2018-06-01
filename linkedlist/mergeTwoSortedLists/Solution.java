package linkedlist.addTwoNumbers;

public class Solution {
  public ListNode mergeTwoSortedLists(ListNode node1, ListNode node2) {
    if(node1 == null) {
      return node2;
    }
    if(node2 == null) {
      return node1;
    }

    ListNode prehead = new ListNode(-1);
    ListNode prev = prehead;

    while(node1 != null && node2 != null) {
      if(node1.data <= node2.data) {
        prev = node1;
        node1 = node1.next;
      }else {
        prev = node2;
        node2 = node2.next;

      }
      prev = prev.next;
    }

    while(node1 != null) {
      prev = prev.next;
      node1 = node1.next;
    }
    while(node2 != null) {
      prev = prev.next;
      node2 = node2.next;
    }

    return prehead.next;
  }

  class ListNode {
    int data;
    ListNode next;
    
    ListNode(int x) {
      data = x;
      next = null;
    } 
  }
}
