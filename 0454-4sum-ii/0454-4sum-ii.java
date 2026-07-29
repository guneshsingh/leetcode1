class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count=0;
        HashMap <Integer,Integer> mpp=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                int sum1 = nums1[i] + nums2[j];
                mpp.put(sum1, mpp.getOrDefault(sum1, 0) + 1);

            }
        }
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                int sum=-(nums3[i]+nums4[j]);
                if(mpp.containsKey(sum)){
                    count+=mpp.get(sum);
                }
            }}
            return count;
    }
}