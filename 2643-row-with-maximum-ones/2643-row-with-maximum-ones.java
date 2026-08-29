class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int count=Integer.MIN_VALUE;
        int a=0;
        for(int i=0;i<m;i++){
            int t=0;
            for(int j=0;j<n;j++){
                t+=mat[i][j];
                if(t>count){
                    count=t;
                    a=i;
                }
            }
        }
        return new int[]{a,count};
    }
}