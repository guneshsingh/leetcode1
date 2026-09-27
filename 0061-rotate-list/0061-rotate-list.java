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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode temp1=head;
        int n=0;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        k=k%n;
        
        while(k>0){
            temp=head;
            while(temp.next.next!=null ){
                temp=temp.next;
            }
            ListNode last=temp.next;
            temp.next=null;
            last.next=temp1;
            temp1=last;
            k--;
        }
        return temp1;
    }
}