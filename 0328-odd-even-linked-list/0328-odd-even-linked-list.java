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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return head;
        }
        int len=0;
        ListNode temp = head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        temp = head;
        int[] arr = new int[len];
        int i=0;
        int count=0;
        if(len%2==0)
            count=len/2-1;
        else
            count=len/2;
        for(;i<=count;i++){
            arr[i]=temp.val;
            if(temp.next!=null && temp.next.next!=null)
                temp=temp.next.next;
        }
        temp = head.next;
        for(;i<len;i++){
            arr[i]=temp.val;
            if(temp.next==null || temp.next.next==null)
                break;
            temp=temp.next.next;
        }
        temp = head;
        for(i=0;i<len;i++){
            temp.val=arr[i];
            temp=temp.next;
        }
        return head;
    }
}