/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    private int getLength(ListNode node) {
        int count = 0;
        while(node != null) {
            node = node.next;
            count++;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        
        int diff = (lenA - lenB > 0) ? lenA - lenB : lenB - lenA;
        
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        
        if(lenA > lenB) {
            while(diff > 0) {
                nodeA = nodeA.next;
                diff--;
            }
        }else if(lenA < lenB) {
            while(diff > 0) {
                nodeB = nodeB.next;
                diff--;
            }
        }
        
        while(nodeA != null && nodeB != null) {
            if(nodeA == nodeB) return nodeA;
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        return null;
    }
}