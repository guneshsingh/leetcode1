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
        int n=1;
        while(temp.next!=null){
            n++;
            temp=temp.next;
        }
        
        k=k%n;
       temp.next=temp1;
       int d=n-k;
       
       while(d>1){
        d--;
        temp1=temp1.next;
        
       }
       System.out.print(temp1.val);
       head=temp1.next;
       temp1.next=null;
       return head;
    }
    
}