class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int n=nums.size();
        vector<int>a;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                a.push_back(nums[i]);}
        }
        while(a.size()<n){
            a.push_back(0);
        }
        nums=a;
    }
};