class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> h=new HashMap<>();
        List<Integer> a=new ArrayList<>();
        int m=nums.length/3 ;
        for(int i: nums){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(int i=0;i<nums.length;i++){
           
            if(h.get(nums[i])>m && !a.contains(nums[i])){
                a.add(nums[i]);
            }
        }   return a;
    }
}