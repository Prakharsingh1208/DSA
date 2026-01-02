package Leetcode;

import java.util.HashMap;

public class LinkedListCycleII {

    // Definition for singly-linked list
    static class ListNode2 {
        int val;
        ListNode2 next;

        ListNode2(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // ---------- SOLUTION METHOD (logic intentionally minimal) ----------
    public static ListNode2 hasCycle(ListNode2 head) {
        ListNode2 slow = head;
        ListNode2 fast = head;
        boolean cycleExists = false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                cycleExists = true;
                break;}
        }
        if(cycleExists){
            return null;
        }
        ListNode2 ptr1 = head;
        while (ptr1!=slow){
            ptr1 = ptr1.next;
            slow = slow.next;
        }

        return ptr1;
    }
    // ------------------------------------------------------------------

    // Helper method to create linked list with optional cycle
    public static ListNode2 createLinkedList(int[] arr, int pos) {
        if (arr == null || arr.length == 0) return null;

        ListNode2 head = new ListNode2(arr[0]);
        ListNode2 current = head;
        ListNode2 cycleNode = null;

        if (pos == 0) {
            cycleNode = head;
        }

        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode2(arr[i]);
            current = current.next;

            if (i == pos) {
                cycleNode = current;
            }
        }

        // create cycle
        if (pos != -1) {
            current.next = cycleNode;
        }

        return head;
    }

    // Main method for local testing
    public static void main(String[] args) {

        int[] arr = {3,2,0,-4};
        int pos = 1;

        ListNode2 head = createLinkedList(arr, pos);
        System.out.println(hasCycle(head)); // expected: false
    }
}
