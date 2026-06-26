class Solution {
public:
    vector<int> searchRange(vector<int>& a, int target) {
        int l=0,r=a.size()-1;
        
        int start=-1,end=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==target){
                start=mid;
                r=mid-1;
            }
            else if(a[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        l=0,r=a.size()-1;
        
        
        while(l<=r){
            int mid=(l+r)/2;
            if(a[mid]==target){
                end=mid;
                l=mid+1;
            }
            else if(a[mid]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return {start,end};
    }
};