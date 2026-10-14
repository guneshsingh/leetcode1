class Solution {
    void getsubsets(int[] nums,List<Integer>ans, int i,List<List<Integer>> allsub){
        if(i==nums.length){
            allsub.add(new ArrayList<>(ans));
            return;
        }
        ans.add(nums[i]);
        getsubsets(nums,ans,i+1,allsub);
        ans.remove(ans.size()-1);
        getsubsets(nums,ans,i+1,allsub);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ls=new ArrayList<>();
        List<Integer>ans=new ArrayList<>();
        getsubsets(nums,ans,0,ls);
        return ls;
            }
}