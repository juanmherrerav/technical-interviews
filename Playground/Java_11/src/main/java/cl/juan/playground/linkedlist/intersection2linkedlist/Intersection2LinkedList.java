package cl.juan.playground.linkedlist.intersection2linkedlist;

import java.util.HashSet;
import java.util.Set;

public class Intersection2LinkedList {

    public ListNode getIntersectionNodeBruteForce(ListNode headA, ListNode headB) {
        while (null != headA){
            ListNode pb = headB;
            while (null != headB){
                if (headA == headB){
                    return headA;
                }
                pb = pb.next;
            }
            headA = headA.next;
        }
        return null;
    }


    public ListNode getIntersectionNodeByUsingHashTable(ListNode headA, ListNode headB) {
        Set<ListNode> nodeInB = new HashSet<ListNode>();
        while ( null != headB){
            nodeInB.add(headB);
            headB = headB.next;
        }
        while (null != headA){
            if (nodeInB.contains(headA)){
                return headA;
            }
            headA = headA.next;
        }
        return null;
    }

    public ListNode getIntersectionNodeByUsingTwoPointers(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }

}
