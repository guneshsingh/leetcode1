class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        int m=nums.size();
        int p=0,n=1;
        vector<int>ans(m);
        for(int i=0;i<m;i++){
            if(nums[i]<0){
                ans[n]=nums[i];
                n+=2;
            }
            else{
                ans[p]=nums[i];
                p+=2;
            }
        }
        return ans;
    }
};