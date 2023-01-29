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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next==null)
            return null;
        int k=0,len=1;
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null){
            if(k==n){
                slow=slow.next;
            }else{
                k++;
            }
            fast=fast.next;
            len++;
        }
        if(len==n)
            return head.next;
        slow.next=slow.next.next;
        return head;
    }
}