class Solution {
    int partition(int [] a,int low,int high){
        int pivot=a[low];
        int s=low;
        while(low<high){
            while(low<=high && a[low]<=pivot ) low++;
            while(high>=low && a[high]>pivot) high--;
            if(low<high){
                int t=a[low];
                a[low]=a[high];
                a[high]=t;}
        }
        int temp=a[s];
        a[s]=a[high];
        a[high]=temp;
        return high;
    }
    int qs(int [] nums,int low,int high,int target){
        if(low<=high){
           int p = partition(nums, low, high);

if (p == target)
    return nums[p];
else if (p < target)
    return qs(nums, p + 1, high, target);
else
    return qs(nums, low, p - 1, target);
        }
        return -1;
    }
    public int findKthLargest(int[] nums, int k) {
       int target=nums.length-k;
       return qs(nums,0,nums.length-1,target);
    }
}