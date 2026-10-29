class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> countAnagrams=new ArrayList<>();
        Map<Character,Integer>frequencyMap=new HashMap<>();
        for(char ch:p.toCharArray()){
            frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1);

        }
        int start=0;
        int match=0;
        for(int end=0;end<s.length();end++){
            char curr=s.charAt(end);
            if(frequencyMap.containsKey(curr)){
                frequencyMap.put(curr,frequencyMap.getOrDefault(curr,0)-1);
                if(frequencyMap.get(curr)==0) match++;

            }
            if(end-start+1>p.length()){
                char last=s.charAt(start);
                if(frequencyMap.containsKey(last)){
                    if(frequencyMap.get(last)==0){
                        match--;
                    }
                    frequencyMap.put(last,frequencyMap.getOrDefault(last,0)+1);
                }
                start++;
            }
            if(match==frequencyMap.size()) {
                countAnagrams.add(start);
            }
        }
        return countAnagrams;
    }
}