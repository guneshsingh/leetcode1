class Solution {
    public 
    int f(int[] w,int mid){
        int load=0,day=1;
        for(int i=0;i<w.length;i++){
            if(load+w[i]>mid){
                day+=1;
                load=w[i];
            }
            else{
                load+=w[i];
            }
        }
        return day;
    }
    int m(int[] v){
        int s=Integer.MIN_VALUE;
        for(int i=0;i<v.length;i++){
            s=Math.max(s,v[i]);
        }
        return s;
    }
    int shipWithinDays(int[] weights, int days) {
        int max_ele=m(weights);
        int sum=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
        }
        while(max_ele<=sum){
            int mid=(max_ele+sum)/2;
            if(f(weights,mid)<=days){
                sum=mid-1;
            }
            else{
                max_ele=mid+1;
            }
        }
        return max_ele;
    }
}