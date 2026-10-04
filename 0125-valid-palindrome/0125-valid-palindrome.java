class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            if (Character.isLetterOrDigit(s.charAt(i))){
                str = str + Character.toLowerCase(s.charAt(i));
            }
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}