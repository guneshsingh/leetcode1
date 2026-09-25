/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode,Integer> mpp=new HashMap<>();
        ListNode t1=headA;
        ListNode t2=headB;
        while(t1!=null){
            mpp.put(t1,1);
            t1=t1.next;
        }
        while(t2!=null){
            if(mpp.containsKey(t2)){
                return t2;
            }
            t2=t2.next;
            }
            return null;
        }
        
    
}