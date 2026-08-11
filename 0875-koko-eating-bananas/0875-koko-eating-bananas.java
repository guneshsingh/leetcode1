class Solution {
    public 
    int maxi(int[] piles){
        int m=Integer.MAX_VALUE;
        int n=piles.length;
        for(int i=0;i<n;i++){
            m=Math.max(m,piles[i]);
        }
        return m;
    }
    long hours(int[] piles,int h){
        int n=piles.length;
        long ans=0;
        for(int i=0;i<n;i++){
            ans+=Math.ceil((double)piles[i]/(double)h);
        }
        return ans;
    }
    int minEatingSpeed(int[] piles, int h) {
        int l=1,hi=maxi(piles);
        while(l<=hi){
            int mid=l+(hi-l)/2;
            long ho=hours(piles,mid);
            if(ho<=h){
                hi=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}