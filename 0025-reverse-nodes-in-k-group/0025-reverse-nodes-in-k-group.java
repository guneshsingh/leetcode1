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
    ListNode reversell(ListNode temp){
        ListNode curr=temp;
        ListNode prev=null;
        while(curr!=null){
            ListNode t=curr.next;
            curr.next=prev;
            prev=curr;
            curr=t;
        }
        return prev;
    }
    ListNode getkthnode(ListNode temp,int k){
        k-=1;
        while(temp!=null&& k>0){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp=head;
        ListNode prevLast=null;
        while(temp!=null){
            ListNode kthnode=getkthnode(temp,k);
            if(kthnode==null){
                if(prevLast!=null) prevLast.next=temp;
                break;

            }
            ListNode newnode=kthnode.next;
            kthnode.next=null;
            reversell(temp);
            if(temp==head){
                head=kthnode;
            }
            else{
                prevLast.next=kthnode;
            }
            prevLast=temp;
            temp=newnode;
        }
        return head;
    }
}