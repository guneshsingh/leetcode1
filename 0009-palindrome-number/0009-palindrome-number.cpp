class Solution {
public:
    bool isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long long rev=0;
        int xcopy=x;
        while(xcopy>0){
            rev=(rev*10)+(xcopy%10);
            xcopy/=10;
        }
        return rev==x;
    }
};
