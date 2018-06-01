package linkedlist.mergeklists;

import java.util.List;
import java.util.ArrayList;

/*
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
*/


public class Solution {
    List<LinkNode> lists;
    LinkNode node1, node2, node3;

    public Solution() {
    System.out.println("Enter Solution construction..");
    lists = new ArrayList<LinkNode>();
    node1 = new LinkNode(2);
    node1.next = new LinkNode(4);
    node1.next.next = new LinkNode(5);
    node2 = new LinkNode(2);
    node2.next = new LinkNode(3);
    node2.next.next = new LinkNode(4);
    node3 = new LinkNode(3);
    node3.next = new LinkNode(5);
    node3.next.next = new LinkNode(6);
    lists.add(node1);
    lists.add(node2);
    lists.add(node3);
    System.out.println("leave Solution construction..");
    }

  class LinkNode {
    int val;
    LinkNode next;

    LinkNode(int data) {
      val = data;
    }
  }

  public LinkNode mergeKLists(List<LinkNode> lists) {
    System.out.println("Enter mergeKLists..");
    if(lists.size() == 0) {
      return null;
    }

    System.out.println("Leave mergeKLists..");
    return mergeHelper(lists, 0, lists.size() - 1);
  }

  private LinkNode mergeHelper(List<LinkNode> lists, int start, int end) {
    System.out.println("Enter mergeHelper.. start = " + start + "; end = " + end);
    if(start == end) {
    System.out.println("  --Leave mergeHelper.., start = end");
      return lists.get(start); 
    }

    int mid = start + (end - start) / 2;
    System.out.println(" Enter left mergeHelper.., mid = " + mid);
    LinkNode left = mergeHelper(lists, start, mid);
    System.out.println(" Enter right mergeHelper.., mid = " + mid);
    LinkNode right = mergeHelper(lists, mid + 1, end);

    System.out.println(" -Leave mergeHelper..");
    return mergeList(left, right);
  }

  private LinkNode mergeList(LinkNode node1, LinkNode node2) {
    System.out.println("Enter mergeList.." + "node1=" + node1.val + "node2=" + node2.val);
    LinkNode dummy = new LinkNode(0);
    LinkNode temp = dummy;

    while(node1 != null && node2 != null) {
      if(node1.val < node2.val) {
        temp.next = node1; //dummy list points to smaller LinkNode
        temp = node1; // temp moves to next/end LinkNode
        node1 = node1.next; // node1 moves to next
      }else {
        temp.next = node2;
        temp = node2;
        node2 = node2.next;
      }
    }
    
    if(node1 != null) {
      temp.next = node1;
    }else { 
      temp.next = node2;
    }

    System.out.println("Enter mergeList..");
    LinkNode printNode = dummy.next;
    while(printNode != null) {
      System.out.print("->" + printNode.val);
      printNode = printNode.next;
    }
    System.out.println();
    return dummy.next;
  }


  public static void main(String[] args) {
    Solution s = new Solution();
    s.mergeKLists(s.lists);
  }
}
