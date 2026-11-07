class Solution {
    public int minSubarray(int[] nums, int p) {
        int n=nums.length;
  
        long sum=nums[0];
       
        for(int i=1;i<n;i++){
            sum+=nums[i];
            
        }
        if(sum%p==0) return 0;

        long target=sum%p;
        Map<Integer,Integer>map=new HashMap<>();
        map.put(0,-1);
        int curr=0;
        int ans=n;
        for(int i=0;i<n;i++){
            curr=(int)((curr+(long)nums[i])%p);
            int need=(int)(((long)curr-target+p)%p);
            if(map.containsKey(need)){
                ans=Math.min(ans,i-map.get(need));
            }
            map.put(curr,i);
        }
        return ans==nums.length?-1:ans;
    }
}