class Solution {
    public int[] countServers(int n, int[][] logs, int x, int[] queries) {
        Arrays.sort(logs,(a,b)->a[1]-b[1]);
        Map<Integer,Integer>frequencyMap=new HashMap<>();
        int[][] sortedqueries=new int[queries.length][2];
        for(int i=0;i<queries.length;i++){
            sortedqueries[i]=new int[]{queries[i],i};
        }
        Arrays.sort(sortedqueries,(a,b)->a[0]-b[0]);
        int [] answer=new int[queries.length];
        int m=logs.length;
        int start=0,end=0;
        for(int i=0;i<sortedqueries.length;i++){
            int min=sortedqueries[i][0]-x;
            int max=sortedqueries[i][0];
            int index=sortedqueries[i][1];
            while(end<m&& logs[end][1]<=max){
                frequencyMap.put(logs[end][0],frequencyMap.getOrDefault(logs[end][0],0)+1);
                end++;
            }
            while(start<end && logs[start][1]<min){
                frequencyMap.put(logs[start][0],frequencyMap.get(logs[start][0])-1);
                if(frequencyMap.get(logs[start][0])==0){
                    frequencyMap.remove(logs[start][0]);
                }
                start+=1;
            }
            answer[index]=n-frequencyMap.size();
        }
        return answer;
    }
}