class Solution {
    int fun(int[][] mat,int n,int m,int mid){
        int maxi=-1;
        int index=-1;
        for(int i=0;i<n;i++){
            if(mat[i][mid]>maxi){
                maxi=mat[i][mid];
                index=i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int l=0,h=m-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int f=fun(mat,n,m,mid);;
            int left=mid-1>=0?mat[f][mid-1]:-1;
            int right=mid+1<m?mat[f][mid+1]:-1;
            if(mat[f][mid]>left&&mat[f][mid]>right){
                return new int[]{f,mid};
            }
            else if(mat[f][mid]<left) h=mid-1;
            else l=mid+1;
        }
        return new int[]{-1,-1};
    }
}