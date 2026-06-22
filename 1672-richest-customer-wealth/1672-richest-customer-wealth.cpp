class Solution {
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int sum=0;
        vector<int>nums;
        for(int i=0;i<accounts.size();i++){
            for(int j=0;j<accounts[i].size();j++){
                sum=sum+accounts[i][j];
            }
            nums.push_back(sum);
            sum=0;
        }
        int max=*max_element(nums.begin(),nums.end());
        return max;
    }
};