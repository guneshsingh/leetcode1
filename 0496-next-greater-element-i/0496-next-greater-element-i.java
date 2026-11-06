class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        
        for(int i=0;i<nums1.length;i++){
            int j=0;
            while(nums1[i]!=nums2[j]){
                j++;
            }
            if(j+1<nums2.length){
            while(j+1<nums2.length){
            if(nums2[j+1]>nums1[i]){
                ans[i]=nums2[j+1];
                break;
            }
            else{
                ans[i]=-1;
            }
            j++;}}
            else{
                ans[i]=-1;
            }
        }
        return ans;
    }
}