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
    ListNode rev(ListNode head){
        if(head==null||head.next==null) return head;
        ListNode newhead=rev(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newhead;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null && head.next==null) return true;
        // if(head.next==null) return false;
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newhead=rev(slow.next);
        ListNode first=head;
        ListNode second=newhead;
        while(second!=null){
            if(first.val!=second.val){
                rev(newhead);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        rev(newhead);
        return true;
    }
}