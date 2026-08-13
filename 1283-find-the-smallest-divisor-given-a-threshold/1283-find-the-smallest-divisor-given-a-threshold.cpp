class Solution {
public:
int sum(vector<int>& nums, int div){
    int sum=0;
    for(int i=0;i<nums.size();i++){
        sum+=ceil((double)nums[i]/(double)div);
    }
    return sum;
}
    int smallestDivisor(vector<int>& nums, int threshold) {
        int maxi=*max_element(nums.begin(),nums.end());
        int l=1,h=maxi;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(sum(nums,mid)<=threshold){
                int ans=mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }

        }
        return l;
    }
};