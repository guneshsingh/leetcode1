class Solution {
public:
    bool isPalindrome(string s) {
        string str="";
        for(int i=0;i<s.size();i++){
            if(isalnum(s[i]))
            str+=tolower(s[i]);
        }
        
        int n=str.size();
        for(int i=0;i<n;i++){
            if(i>=(n/2))
            return true;
            if(str[i]!=str[n-i-1]){
                return false;
            }
        }
        return true;
    }
};