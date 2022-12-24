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
    public ListNode middleNode(ListNode head) {
        ListNode current = head;
        int size=0;
        while(current!=null){
            size++;
            current=current.next;
        }
        System.out.println(size);
        size=size/2 + 1;
        System.out.println("After"+size);
        while(size!=1){
            head=head.next;
            size--;
        }
        return head;
    }
}