class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix=new int[gain.length+2];
        prefix[1]=gain[0];
        for(int i=1;i<gain.length;i++){
            prefix[i+1]=gain[i]+prefix[i];
        }
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<prefix.length;i++){
            maxi=Math.max(maxi,prefix[i]);
    }
    return maxi;}
}