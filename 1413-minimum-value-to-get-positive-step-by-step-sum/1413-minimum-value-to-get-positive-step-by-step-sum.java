class Solution {
    public int minStartValue(int[] nums) {
        int sum=0;
        int mini=0;
        for(int num:nums){
            sum+=num;
            mini=Math.min(mini,sum);
        }
        return 1-mini;
    }
}