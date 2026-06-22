class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        int sum=0;
        vector<int>num;
        for(int i=0;i<nums.size();i++){
            sum+=nums[i];
            num.push_back(sum);
            }
        return num;
    }
};