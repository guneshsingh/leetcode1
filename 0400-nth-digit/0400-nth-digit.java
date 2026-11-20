class Solution {
    public int findNthDigit(int n) {
        long len=1;
        long count=9;
        long start=1;
        while(n>count*len){
            n-=count*len;
            len++;
            count*=10;
            start*=10;
        }
        long num=start+(n-1)/len;
        int  index=(int)((n-1)%len);
        String s=String.valueOf(num);
        return s.charAt(index)-'0';
    }
}