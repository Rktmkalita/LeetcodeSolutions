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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headA!=null){
            ListNode current = headB;
            while(current!=null){
                if(current==headA){
                    return headA;
                }
                current=current.next;
            }
            headA=headA.next;
        }
        return null;
    }
}