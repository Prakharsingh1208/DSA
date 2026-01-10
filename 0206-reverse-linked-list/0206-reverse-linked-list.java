/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    //Input: head = [1,2,3,4,5]
    //Output: [5,4,3,2,1]
    public ListNode reverseListHelper(ListNode current,ListNode prev){
        if(current==null){
            return prev;
        }  
        ListNode next = current.next;
        current.next = prev;
        prev = current;
        current = next;
        return reverseListHelper(current,prev);
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        return reverseListHelper(current,prev);
         
    }
}