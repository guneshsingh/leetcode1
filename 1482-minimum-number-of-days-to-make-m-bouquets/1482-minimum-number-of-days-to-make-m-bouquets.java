class Solution {
    public 
    int possible(int[] a,int day,int m,int k){
        int count=0;
        int nob=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=day){
                count++;
                
            }
            else{
                nob+=(count/k);
                count=0;
            }
        }
        nob+=count/k;
        return(nob >= m) ? 1 : 0  ;  }
    int minDays(int[] bloomDay, int m, int k) {
        long ans=m*1L*k*1L;
        if(ans>bloomDay.length){
            return -1;
        }
        int maxi=Integer.MIN_VALUE,mini=Integer.MAX_VALUE;
        for(int i=0;i<bloomDay.length;i++){
            maxi=Math.max(maxi,bloomDay[i]);
            mini=Math.min(mini,bloomDay[i]);
        }
        int l=mini,h=maxi;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(possible(bloomDay,mid,m,k)==1){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
            }
}