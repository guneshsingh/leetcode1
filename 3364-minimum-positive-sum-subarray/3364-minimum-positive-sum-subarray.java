class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        
        int mini=Integer.MAX_VALUE;
        for(int start=0;start<n;start++){
            
        int sum=0;
        for(int end=start;end<n;end++){
            int curr=nums.get(end);
            sum+=curr;
            // if(end-start+1>r){
            //     sum-=nums.get(start);
            //     start++;
            // }
            if(end-start+1>=l && end-start+1<=r){
                if(sum>0){
                    mini=Math.min(mini,sum);
                }
            }}
            
        }
        return mini==Integer.MAX_VALUE?-1:mini;
    }
}