class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
        List<int[]> m = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
           if(m.isEmpty() || m.get(m.size() - 1)[1] < intervals[i][0]){
                m.add(intervals[i]);
            }
            else{
                 m.get(m.size() - 1)[1] =
                    Math.max(m.get(m.size() - 1)[1], intervals[i][1]);
            }
            
        }
        return m.toArray(new int[m.size()][]);
    }
}