class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
       Arrays.sort(strs);
        String f=strs[0];
        String l=strs[strs.length-1];
        String a="";
        int mini=Math.min(f.length(),l.length());
        for(int i=0;i<mini;i++){
            if(f.charAt(i)!=l.charAt(i)) break;
            a+=f.charAt(i);
        }
        return a;
    }
}