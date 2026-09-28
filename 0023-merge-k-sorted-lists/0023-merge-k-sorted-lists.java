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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode t1=lists[i];
            while(t1!=null){
                arr.add(t1.val);
                t1=t1.next;
            }
        }
        if(arr.isEmpty()) return null;
        Collections.sort(arr);
        ListNode dummy=new ListNode(-1);
        ListNode temp=new ListNode(0);
        dummy.next=temp;
        for(int i=0;i<arr.size();i++){
            temp.val=arr.get(i);
            ListNode temp1=new ListNode(0);
            temp.next=temp1;
            temp=temp1;
        }
        ListNode t2=dummy.next;
        while(t2.next.next!=null){
            t2=t2.next;
        }
        t2.next=null;
        return dummy.next;
    }
}