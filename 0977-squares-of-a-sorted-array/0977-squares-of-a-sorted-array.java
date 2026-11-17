class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=nums[i]*nums[i];
                    }
        // Arrays.sort(nums);
        // return nums;
        int left=0,right=n-1;
        int [] arr=new int[n];
        for(int i=n-1;i>=0;i--){
            if(nums[left]>nums[right]){
                arr[i]=nums[left];
                left++;
            }
            else{
                arr[i]=nums[right];
                right--;
            }
            
            
        }
        return arr;
    }
}