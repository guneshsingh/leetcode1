class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int start=0;
        int maxi=Integer.MIN_VALUE;
        int len=0;
        int maxfreq=0;
        Map<Character,Integer>mpp=new HashMap<>();
        for(int end=0;end<n;end++){
            mpp.put(s.charAt(end),mpp.getOrDefault(s.charAt(end),0)+1);
            maxfreq=Collections.max(mpp.values());
            if(((end-start+1)-maxfreq)>k){
               mpp.put(s.charAt(start),mpp.getOrDefault(s.charAt(start),0)-1);
               start+=1;
            }
            else{
            len=Math.max(end-start+1,len);}
        }
        
        return len;
    }
}