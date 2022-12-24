/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode current=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            current=current.next;
            fast=fast.next.next;
            if(current==fast){
                System.out.println(current.val);
                current=head;
                while(current!=fast){
                    current=current.next;
                    fast=fast.next;
                }
                return current;
            }
        }
        return null;
    }
}