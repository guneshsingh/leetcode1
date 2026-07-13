class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int sum=0;
        int i=0;
        for (i=0;i<nums.size();i++){
            for(int j=0;j<nums.size();j++){
                if(i==j)
                continue;
            sum=nums[i]+nums[j];
            if(sum==target)
            return {i,j};
        }
        }
        return {};
    }
};