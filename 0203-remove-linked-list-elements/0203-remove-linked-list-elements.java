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
    public ListNode removeElements(ListNode head, int val) {
        ListNode p = head;
        if (head==null) return null;
        while (p.next!=null){
            if (p.next.val==val) 
                p.next=p.next.next;
            else 
                p=p.next;
        }
        if (head.val==val) 
            return head.next;
        return head;
    }
}