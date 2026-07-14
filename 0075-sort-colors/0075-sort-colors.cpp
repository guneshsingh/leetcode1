class Solution {
public:
    void sortColors(vector<int>& nums) {
            vector<int> count0;
        vector<int> count1;
        vector<int> count2;
        for(int i=0;i<nums.size();i++){
            if(nums[i]==0)
            count0.push_back(nums[i]);
            else if(nums[i]==1)
            count1.push_back(nums[i]);
            else
            count2.push_back(nums[i]);
        }
        int j=0;
        for(int i=0;i<count0.size();i++){
            nums[j]=count0[i];
            j++;
        }
        for(int i=0;i<count1.size();i++){
            nums[j]=count1[i];
            j++;
        }
        for(int i=0;i<count2.size();i++){
            nums[j]=count2[i];
            j++;
        }}
};