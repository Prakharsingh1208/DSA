package Leetcode;

public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=head;
        if(dummy==null || dummy.next==null){
            return dummy;
        }
        //[1,2,3,4,5]
        while (dummy!=null && dummy.next!=null){
            int temp = dummy.val;
            dummy.val=dummy.next.val;
            dummy.next.val = temp;
            dummy=dummy.next.next;
        }
        return head;
    }
}