class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> m = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int s=intervals[i][0];
            int l=intervals[i][1];
            if(!m.isEmpty() && l<=m.get(m.size()-1)[1]){
                continue;
            }
            for(int j=i+1;j<intervals.length;j++){
                if(intervals[j][0]<=l){
                    l=Math.max(l,intervals[j][1]);
                }
                else{
                    break;
                }
            }
            m.add(new int[]{s, l});
        }
        return m.toArray(new int[m.size()][]);
    }
}