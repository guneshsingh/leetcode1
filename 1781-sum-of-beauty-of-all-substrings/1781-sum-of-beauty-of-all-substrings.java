class Solution {
    public int beautySum(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++){
           int[] freqArray=new int[26];
            for(int j=i;j<s.length();j++){
                freqArray[s.charAt(j)-'a']++;
                int maxi=Integer.MIN_VALUE;
                int mini=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freqArray[k]>0){
                    maxi=Math.max(maxi,freqArray[k]);
                    mini=Math.min(mini,freqArray[k]);
                }
                }
                sum+=maxi-mini;
            }
        }
        return sum;
    }
}