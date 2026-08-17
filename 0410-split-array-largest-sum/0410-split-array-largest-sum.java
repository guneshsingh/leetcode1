class Solution {

    public 
    int split(int[] nums, int mid){
        int s=1,sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }
            else{
                s++;
                sum=nums[i];
            }
        }
        return s;
    }
    int splitArray(int[] nums, int k) {
        int n=nums.length;
        int l=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            l=Math.max(l,nums[i]);
        }
        int h=0;
        for(int i=0;i<n;i++){
            h+=nums[i];
        }
        while(l<=h){
            int mid=l+(h-l)/2;
            int nu=split(nums,mid);
            if(nu>k) l=mid+1;
            else h=mid-1;
        }
        return l;
    }
}