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
// class Solution {
//     public ListNode removeNodes(ListNode head) {
//         int maxi=Integer.MIN_VALUE;
//         Stack<ListNode>st=new Stack<>();
//         ListNode temp=head;
//         while(temp!=null){
//             st.push(temp);
//             temp=temp.next;
//         }
//         ListNode dummy=null;
//         while(!st.isEmpty()){
//             ListNode curr=st.pop();
//         if(curr.val>=maxi){
//             curr.next=dummy;
//             dummy=curr;
//             maxi=curr.val;
//         }
        
//     }
//     return dummy;
//     }
// }
// reverse krlo phle then smaller elements ko skip krte rho aur jo end wali list me usko reverse krdo
class Solution {
    ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode temp1=temp.next;
            temp.next=prev;
            prev=temp;
            temp=temp1;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        ListNode revhead=reverse(head);
        ListNode curr=revhead;
        ListNode n=curr.next;
        while(n!=null){
            if(curr.val>n.val){
                n=n.next;
            }
            else
            {curr.next=n;
            curr=n;
            n=n.next;}
        }
        curr.next=null;
        ListNode ans=reverse(revhead);
        return ans;
    }} 