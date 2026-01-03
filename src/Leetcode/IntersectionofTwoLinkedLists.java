package Leetcode;

import java.util.HashMap;

public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        Solution with time complexity of O(M+N) and space complexity of O(M)
//        HashMap<ListNode,Boolean> map = new HashMap<>();
//        if(headA==null || headB==null){
//            return null;
//        }
//        while (headA!=null){
//            map.put(headA,true);
//            headA=headA.next;
//        }
//        while (headB!=null){
//            if(map.containsKey(headB)){
//                return headB;
//            }
//            headB=headB.next;
//        }
//        return null;

//        Solution with the time complexity of o(MN) and space complexity of O(1)
//        ListNode originalHeadB = headB;
//        while (headA!=null){
//
//            while (headB!=null){
//                if(headA==headB){
//                    return headA;
//                }
//                headB=headB.next;
//            }
//            headA=headA.next;
//            headB=originalHeadB;
//        }
//        return null;
        ListNode listA = headA;
        ListNode listB = headB;
        while (listA != listB) {
            listA = (listA == null) ? headB : listA.next;
            listB = (listB == null) ? headA : listB.next;
        }
        return listA;
    }
}
