class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer>frequencyMap=new HashMap<>();
        int n=nums.length;
        int count=0,sum=0;
        frequencyMap.put(0,1);
        for(int num:nums){
            sum+=num;
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(frequencyMap.containsKey(rem)){
                count+=frequencyMap.get(rem
                );
            }
            frequencyMap.put(rem,frequencyMap.getOrDefault(rem,0)+1);
        }
    
        return count;
    }
}