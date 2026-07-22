class Solution {
    public List<Integer>g(int rows){
        List<Integer> ls=new ArrayList<>();
        long ans=1;
        ls.add(1);
        for(int i=1;i<rows;i++){
            ans=ans*(rows-i);
            ans=ans/i;
            ls.add((int)ans);
        }
        return ls;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> s=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            s.add(g(i));
        }
        return s;
    }
}