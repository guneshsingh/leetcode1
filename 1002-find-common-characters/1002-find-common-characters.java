class Solution {
    public List<String> commonChars(String[] words) {
        List<String> ls=new ArrayList<>();
        Map<Character,Integer> mpp=new HashMap<>();
        for(int i=0;i<words[0].length();i++){
            char ch=words[0].charAt(i);
            mpp.put(ch,mpp.getOrDefault(ch,0)+1);
        }
        for(int k=0;k<words.length;k++){
            Map<Character,Integer> curr=new HashMap<>();
            for(int i=0;i<words[k].length();i++){
                char ch=words[k].charAt(i);
                curr.put(ch,curr.getOrDefault(ch,0)+1);
            }
            
            for( char ch:mpp.keySet()){
                if(curr.containsKey(ch)){
                    mpp.put(ch,Math.min(mpp.get(ch),curr.get(ch)));
                }
                else {
                    mpp.put(ch, 0);
                }
            }

        }
        for(char ch:mpp.keySet()){
            for(int i=0;i<mpp.get(ch);i++){
                ls.add(String.valueOf(ch));
            }
        }

        
        
        return ls;
    }
    
}