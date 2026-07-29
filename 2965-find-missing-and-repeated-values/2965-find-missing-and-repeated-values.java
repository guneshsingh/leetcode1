class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long n=grid.length*grid.length;
        long s=0,s2=0;
        long sn=(n*(n+1))/2;
        long s2n=(n*(n+1)*(2*n+1))/6;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                s+=grid[i][j];
                s2+=grid[i][j]*grid[i][j];
            }
        }
        long x=s-sn;
        long y=s2-s2n;
        y=y/x;
        long a=(x+y)/2;
        long b=a-x;
        return new int[] {(int)a,(int)b};
    }
}