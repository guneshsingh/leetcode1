/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        ListNode* temp=head;
        int s=0;
        if(head==nullptr){
            return head;
        }
        while(temp->next!=nullptr){
            temp=temp->next;
            s++;
            if(s>10000000){
                return true;
            }
        }
        return false;
    }
};