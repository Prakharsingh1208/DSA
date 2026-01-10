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
    
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;

        Stack<ListNode> list = new Stack<>();

        while(head!=null){
            list.push(head);
            head = head.next;
        }
        
        ListNode headElement = list.pop();
        ListNode curr = headElement;


        while(!list.isEmpty()){
            curr.next = list.pop();
            curr= curr.next;
        }
        
        curr.next = null;

        return headElement;
    }
}