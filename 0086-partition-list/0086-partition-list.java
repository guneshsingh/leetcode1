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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(-1);
        ListNode dummy2=new ListNode(-1);
        ListNode prev=dummy;
        ListNode prev2=dummy2;
        ListNode curr=head;
        ListNode c=head;
        while(curr!=null){
            if(curr.val<x){
                prev.next=curr;
                prev=curr;
            }
            else{
                prev2.next=curr;
                prev2=curr;
            }
            curr=curr.next;
            
        }
        prev2.next=null;
        prev.next=dummy2.next;
        return dummy.next;
    }
}