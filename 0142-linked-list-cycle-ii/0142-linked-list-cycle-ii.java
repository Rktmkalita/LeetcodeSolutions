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
        Set<ListNode> set = new HashSet<ListNode>();
        while(head.next!=null){
            if(set.contains(head)){
                return head;   
            }
            set.add(head);
            head=head.next;
        }
        return null;
    }
}