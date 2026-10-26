class Solution {
    public int findMiddleIndex(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        for(int i=0;i<n;i++){
            if(i==0){
                if(nums[n-1]-nums[i]==0) return i;
            }
            if(i>0 && i<n){
            if(nums[n-1]-nums[i]==nums[i-1]) return i;
       }     if(i==n-1){
                if(nums[i-1]==0) return i;
            }
        }
        return -1;
    }
}