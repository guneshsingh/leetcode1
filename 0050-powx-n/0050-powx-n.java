class Solution {
    double solve(double x,long n){
        if (n == 0) return 1.0;
        double half=solve(x,n/2);
        if(n%2==0) {
            return half*half;
        }
       
           return half*half*x;
        
    }
    public double myPow(double x, int n) {

       
        long p=n;
       if (p < 0) {
            p = -p;
            return 1.0 / solve(x, p);
        }
        return solve(x,p);
    }
}