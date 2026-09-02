class Solution {
    public String removeOuterParentheses(String s) {
        int l=0;
        String r="";
        for(char i:s.toCharArray()){
            if(i=='('){
                if(l>0)r+=i;
                l++;
            }
            else{
                l--;
                if(l>0)r+=i;
            }
        }
        return r;
    }
}