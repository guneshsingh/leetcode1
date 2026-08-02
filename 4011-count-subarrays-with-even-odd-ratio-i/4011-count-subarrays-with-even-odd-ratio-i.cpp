class Solution {
public:
    int countRatioSubarrays(vector<int>& nums, int a, int b) {
        int count=0;
        for(int i=0;i<nums.size();i++){
            int e=0,o=0;
            for(int j=i;j<nums.size();j++){
                if(nums[j]%2!=0 ) o++;
                else e++;
                if(o>0 && 1LL *e*b<=1LL*o*a){
                    count++;
                }
                
            }
        }
        return count;
    }
};