class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        List<Integer> list= new ArrayList<>(Collections.nCopies(3,-1));
        for(int i=0;i<s.length();i++){
            list.set(s.charAt(i)-'a',i);
            if(list.get(0)!=-1 &&  list.get(1)!=-1 && list.get(2)!=-1){
                int minIndex = Math.min(
                    list.get(0),
                    Math.min(list.get(1), list.get(2))
                );

                count += minIndex + 1;
            }
        }
        return count;
    }
}