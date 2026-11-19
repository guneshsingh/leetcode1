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
    
public ListNode reverse(ListNode head) {
    ListNode temp = head;
    ListNode prev = null;

    while (temp != null) {
        ListNode temp1 = temp.next;

        temp.next = prev;
        prev = temp;
        temp = temp1;
    }

    return prev;
}

    public int pairSum(ListNode head) {   
        int maxsum=Integer.MIN_VALUE;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null ){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode ptr2=reverse(slow);
        ListNode ptr1=head;
        
        int sum=0;
        while(ptr1!=null && ptr2!=null){
            sum=ptr1.val+ptr2.val;
            maxsum=Math.max(maxsum,sum);
            ptr1=ptr1.next;
            ptr2=ptr2.next;
        }
        return maxsum;
    }
}