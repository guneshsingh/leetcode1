class Solution {
    public int totalFruit(int[] fruits) {
        int start=0;
        int n=fruits.length;
        Map<Integer,Integer>frequencyMap=new HashMap<>();
        int maxlength=0;
        for(int end=0;end<n;end++){
            int curr=fruits[end];
            frequencyMap.put(fruits[end],frequencyMap.getOrDefault(curr,0)+1);
            if(frequencyMap.size()>2){
                int left=fruits[start];
                frequencyMap.put(left,frequencyMap.getOrDefault(left,0)-1);
                if(frequencyMap.get(left)==0){
                    frequencyMap.remove(left);
                }
                start+=1;
            }
            maxlength=Math.max(maxlength,end-start+1);
        }
        return maxlength;
    }
}