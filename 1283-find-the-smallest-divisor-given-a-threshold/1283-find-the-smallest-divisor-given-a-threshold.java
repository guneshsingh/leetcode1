class Solution {
    public 
    int maxi(int[] nums){
        int m=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            m=Math.max(m,nums[i]);
        }
        return m;
    }
    int sum(int[] nums,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=Math.ceil((double)nums[i]/(double)mid);
        }
        return sum;
    }
    int smallestDivisor(int[] nums, int threshold) {
        int l=0;
        int h=maxi(nums);
        while(l<=h){
            int mid=l+(h-l)/2;
            if(sum(nums,mid)<=threshold)
            h=mid-1;
            else
            l=mid+1;
        }
        return l;
    }
}