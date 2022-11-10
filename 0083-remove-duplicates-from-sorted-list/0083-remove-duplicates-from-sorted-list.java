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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode current=head.next;
        ListNode node=head;
        
        while(current!=null){
            if(head.val!=current.val){
                head.next=current;
                head=head.next;
            }else{
                head.next=null;
            }
            current=current.next;
        }
        
        return node;
    }
}