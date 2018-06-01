package linkedlist.addTwoNumbers;

public class Solution {
  public ListNode addTwoNumbers(ListNode node1, ListNode node2) {
    if(node1 == null && node2 == null) {
      return null;
    }

    ListNode output = new ListNode(0);
    ListNode point = output;
    int sum, carry = 0;

    while(node1 != null && node2 != null) {
      sum = node1.data + node2.data + carry;
      carry = sum / 10;
      point.next = new ListNode(sum % 10);
      point = point.next;
      node1 = node1.next;
      node2 = node2.next;
    }

    while(node1 != null) {
      sum = node1.data + carry;
      carry = sum / 10;
      point.next = new ListNode(sum % 10);
      point = point.next;
      node1 = node1.next;
    }
    
    while(node2 != null) {
      sum = node2.data + carry;
      carry = sum / 10;
      point.next = new ListNode(sum % 10);
      point = point.next;
      node2 = node2.next;
    }

    if(carry > 0) {
      point.next = new ListNode(carry);
    }
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
