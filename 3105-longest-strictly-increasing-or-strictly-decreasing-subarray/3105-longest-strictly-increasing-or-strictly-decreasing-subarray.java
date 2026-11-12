class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(nums[j]>nums[j-1]){
                    count++;
                }
                else{
                    break;
                }
            }
            maxi=Math.max(maxi,count);
        }
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[j-1]){
                    count++;
                }
                else{
                    break;
                }
            }
            maxi=Math.max(maxi,count);
        }
        return maxi;
    }
}