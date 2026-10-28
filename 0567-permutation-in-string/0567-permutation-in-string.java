class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> patternMap=new HashMap<>();
        for(char ch:s1.toCharArray()){
            patternMap.put(ch,patternMap.getOrDefault(ch,0)+1);
        }
        int start=0;
        int match=0;
        for(int end=0;end<s2.length();end++){
            char curr=s2.charAt(end);
            if(patternMap.containsKey(curr)){
                patternMap.put(curr,patternMap.getOrDefault(curr,0)-1);
                 if(patternMap.get(curr)==0) match++;
            }
            
            if(end-start+1>s1.length()){
                char left=s2.charAt(start);
                if(patternMap.containsKey(left)){
                if(patternMap.get(left)==0){
                    match--;
                }
                 patternMap.put(left,patternMap.getOrDefault(left,0)+1);
            }
            start++;}
            if(match==patternMap.size()) return true;
        }
        return false;
    }
}