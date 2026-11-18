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
    public ListNode removeNodes(ListNode head) {
        int maxi=Integer.MIN_VALUE;
        Stack<ListNode>st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp);
            temp=temp.next;
        }
        ListNode dummy=null;
        while(!st.isEmpty()){
            ListNode curr=st.pop();
        if(curr.val>=maxi){
            curr.next=dummy;
            dummy=curr;
            maxi=curr.val;
        }
        
    }
    return dummy;
    }
}