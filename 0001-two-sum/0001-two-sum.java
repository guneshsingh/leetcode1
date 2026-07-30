class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> mpp=new HashMap <>();
        for(int i=0;i<nums.length;i++){
           int current=nums[i];
            int m=target-current;
            if(mpp.containsKey(m))
            return new int []{mpp.get(m),i};
            mpp.put(current,i);
        }
        return new int []{1};
    }
}