package Leetcode;

public class MergeTwoSortedLists {
    public static void main(String... args) {

        ListNode list1 =new ListNode(1,
                        new ListNode(2,
                        new ListNode(4)));

        ListNode list2 = new ListNode(1,
                         new ListNode(3,
                         new ListNode(4)));

        Solution solution = new Solution();
        ListNode mergedHead = solution.mergeTwoLists(list1, list2);

        printList(mergedHead);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }
}

class ListNode {
    int  val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }

        if (list1 == null)
            return list2;

        return list1;
    }
}
