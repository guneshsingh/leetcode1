class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int maxi=1;
        int end=0,start=0;
        for(int i=0;i<s.length();i++){
            int left=i,right=i;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                if(right-left+1>maxi){
                    start=left;
                    maxi=right-left+1;
                }
                left--;
                right++;
            }
            left=i;
            right=i+1;
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                if(right-left+1>maxi){
                    start=left;
                    maxi=right-left+1;
                }
                left--;
                right++;
            }

        }
        
        return s.substring(start,start+maxi);
    }
}
