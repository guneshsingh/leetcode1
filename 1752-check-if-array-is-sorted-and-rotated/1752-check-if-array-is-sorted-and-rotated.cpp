class Solution {
public:
    bool check(vector<int>& nums) {
        vector<int>temp;
        for(int i=1;i<nums.size();i++){
            if(nums[i]>=nums[i-1]){

            }
            else{
                for(int j=i;j<nums.size();j++){
                    temp.push_back(nums[j]);
                
                
            }
            for(int j=0;j<i;j++){
                temp.push_back(nums[j]);
            }
            break;
            
        }}
        for(int i=1;i<temp.size();i++){
            if(temp[i]>=temp[i-1]){}
            else{
                return false;
            }
        }
        return true;
    }
};