class Solution {
    int fb(int n){
        if(n==0|| n==1) return n;
        return fb(n-1)+fb(n-2);
    }
    public int fib(int n) {
        return fb(n);
    }
}