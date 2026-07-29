class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int ele=-1;
        for(int i=0;i<nums.length;i++){
            if(count==0 ){
                ele=nums[i];
                count++;
            }
            else if(nums[i]==ele){
                count++;

            }
            else{
                count--;
            }
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(ele==nums[i]){
                c++;
            }
        }
        if(c>Math.ceil(nums.length/2))
        return ele;
        return -1;
    }
}