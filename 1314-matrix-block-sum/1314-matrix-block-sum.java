class Solution {
    private int[][] ans;
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m=mat.length;
        int n=mat[0].length;
        int[][] ans = new int[m][n];
        int[][] a = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int top=i>0?(ans[i-1][j]):0;
                int left=j>0?(ans[i][j-1]):0;
                int topleft=(i>0&&j>0)?(ans[i-1][j-1]):0;
                ans[i][j]=mat[i][j]+top+left-topleft;
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int r1=Math.max(0,i-k);
                int c1=Math.max(0,j-k);
                int r2=Math.min(m-1,i+k);
                int c2=Math.min(n-1,j+k);
                int ele=ans[r2][c2];
                if(r1>0) ele-=ans[r1-1][c2];
                if(c1>0) ele-=ans[r2][c1-1];
                if(r1>0 && c1>0) ele+=ans[r1-1][c1-1];
                a[i][j]=ele;
            }
            }

        return a;
    }
}