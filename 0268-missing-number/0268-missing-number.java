class Solution {
    // public int missingNumber(int[] nums) {
    //     int n=nums.length;
    //     Arrays.sort(nums);
    //     for(int i=0;i<n;i++){
            
    //         if(i!=nums[i]) return i;
    //     }
    //     return n;
    // }
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int target=n*(n+1)/2;
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        return target-nums[n-1];
    }
}