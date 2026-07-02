class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        float m;
        int a=nums1.size();
        int b=nums2.size();
        int c=a+b;
        vector<int>nums3(c);
        for(int i=0;i<a;i++)
            nums3[i]=nums1[i];
        for(int j=0;j<b;j++){
            nums3[a+j]=nums2[j];
            }
        sort(nums3.begin(), nums3.end());
        if(c%2==0){
           m=(nums3[(c)/2]+nums3[(c/2)-1])/2.0;
        }
        else{
             m=nums3[c/2.0];
            
        }
        return m;
    }
};