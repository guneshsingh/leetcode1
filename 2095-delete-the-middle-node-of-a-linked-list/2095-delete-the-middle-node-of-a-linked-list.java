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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null) return null;
        if(head.next.next==null){
            head.next=null;
            return head;
        }
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        int digit;
        if(count%2==0){
            digit=(count/2)+1;

        }
        else{
            digit=(int)Math.ceil((double)count/2);
        }
        ListNode n=head;
        int current=2;
        while(n.next!=null){
            if(current==digit){
                break;
            }
            n=n.next;
            current++;
        }
        n.next=n.next.next;
        
        return head;
    }
}