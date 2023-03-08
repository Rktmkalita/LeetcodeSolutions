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
    public boolean isPalindrome(ListNode head) {
        StringBuilder sbr = new StringBuilder();
        while(head!=null){
            sbr.append(head.val);
            head=head.next;
        }
        String str = sbr.toString();
        String strrev = sbr.reverse().toString();
        System.out.println(str+"  "+strrev);
        if(str.equals(strrev))
            return true;
        else
            return false;
    }
}