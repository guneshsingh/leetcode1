class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer>partitions=new ArrayList<>();
        int start=0,end=0;
        int[] lastoccurence=new int[26];
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            lastoccurence[curr-'a']=i;
        }
        for(int i=0;i<s.length();i++){
            int curr=s.charAt(i);
            int lastindex=lastoccurence[curr-'a'];
            end=Math.max(end,lastindex);
            if(i==end){
                partitions.add(end-start+1);
                start=i+1;
            }
        }
        return partitions;
    }
}