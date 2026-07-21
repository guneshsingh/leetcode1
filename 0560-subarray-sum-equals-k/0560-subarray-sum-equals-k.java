class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>mpp=new HashMap<>();
        int presum=0;
        int count=0;
        mpp.put(0,1);
        for(int i=0;i<nums.length;i++){
            presum+=nums[i];
            int ke=presum-k;
            count+=mpp.getOrDefault(ke,0);
            mpp.put(presum,mpp.getOrDefault(presum,0)+1);
            
        }
        return count;
    }
}