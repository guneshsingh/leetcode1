class Solution {
    public boolean checkString(String s) {
        boolean curr=false;
        for(char ch:s.toCharArray()){
            if(ch=='b'){
                curr=true;
            }
            if(curr==true && ch=='a'){
                return false;}
        }
        return true;
    }
}