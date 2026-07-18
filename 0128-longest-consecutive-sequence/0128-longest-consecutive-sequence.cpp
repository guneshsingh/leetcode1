class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int l=1,count=0,ls=INT_MIN;
        int n=nums.size();
        if(n==0)
        return 0;
        for(int i=0;i<n;i++){
            if(nums[i]-1==ls){
            count+=1;
            ls=nums[i];
            }
            else if(ls!=nums[i]){
                count=1;
                ls=nums[i];
            }
            l=max(l,count);
        }
return l;
    }
};