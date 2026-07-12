class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        int j=0;
        int i=0;
        vector<int>ans;
        sort(nums1.begin(),nums1.end());
        sort(nums2.begin(),nums2.end());

        while(j<nums2.size() && i<nums1.size()){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                if(ans.empty() || ans.back()!= nums1[i])
                ans.push_back(nums1[i]);                
            
            i++;
            j++;}
        }
        return ans;
    }
};