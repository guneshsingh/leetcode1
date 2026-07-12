class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int> m;
        int sum = 0;
        int count = 0;

        m[0] = 1;

        for(int i = 0; i < nums.size(); i++){
            sum += nums[i];
            int r=sum-k;
            count+=m[r];
            m[sum]+=1;
        }

        return count;
    }
};