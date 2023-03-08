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
        int left = 0, right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}