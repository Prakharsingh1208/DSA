package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LinkedListCycle {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // ---------- YOUR SOLUTION GOES HERE ----------
    public static boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    // --------------------------------------------

    // Helper method to create linked list with cycle
    public static ListNode createLinkedList(int[] arr, int pos) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        ListNode cycleNode = null;

        if (pos == 0) {
            cycleNode = head;
        }

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;

            if (i == pos) {
                cycleNode = current;
            }
        }

        // Create cycle if pos != -1
        if (pos != -1) {
            current.next = cycleNode;
        }

        return head;
    }

    // Main method for testing
    public static void main(String[] args) {


        // Example 3
        int[] arr3 = {1,2};
        int pos3 = -1;
        ListNode head3 = createLinkedList(arr3, pos3);
        System.out.println(hasCycle(head3)); // expected: false
    }
}
