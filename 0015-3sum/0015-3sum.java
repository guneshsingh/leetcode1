class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> s= new HashSet<>();;
            for(int j=i+1;j<nums.length;j++){
                int third=-(nums[i]+nums[j]);
                if(s.contains(third)){
                    List<Integer> ls=new ArrayList<>();
                    ls.addAll(List.of(nums[i], nums[j], third));
Collections.sort(ls);
                    st.add(ls);
                }
                s.add(nums[j]);
            }
        }
        
        return new ArrayList<>(st);
    }
}