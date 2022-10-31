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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a=0,b=0,carry=0,sum=0;
        ListNode res=new ListNode(0,null);
        ListNode curr=res;
        while(l1!=null || l2!=null){
            if(l1==null){
                a=0;
            }else{
                a=l1.val;
            }
            if(l2==null){
                b=0;
            }else{
                b=l2.val;
            }
            sum=a+b+carry;
            carry=sum/10;
            res.next=new ListNode(sum%10);
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            res=res.next;
        }
        if(carry>0){
            res.next=new ListNode(carry);
        }
        return curr.next;
    }
}