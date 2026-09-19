/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
bool ispal(vector<int>arr){
    vector<int>b=arr;
    reverse(arr.begin(),arr.end());
    if (b==arr){
        return true;
    }
    else
    return false;
}
    bool isPalindrome(ListNode* head) {
        if(head==nullptr || head->next==nullptr) return true;
        vector<int>arr;
        ListNode* temp=head;
        while(temp!=nullptr){
            arr.push_back(temp->val);
            temp=temp->next;
        }
        if (ispal(arr)==true){
            return true;

        }
        return false;
    }
};