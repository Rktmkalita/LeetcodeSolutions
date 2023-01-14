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
        ListNode prev = new ListNode(0);
        ListNode current = head;
        head=prev;
        prev.next=current;
        while(current!=null){
            if(current.val==val){
                prev.next=current.next;
                current=current.next;
            }else{
                current=current.next;
                prev=prev.next;
            }
        }
        return head.next;
    }
}