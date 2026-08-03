class Solution {
public:
    int search(vector<int>& a, int target) {
        int n=a.size();
        int l=0,h=n-1;
        if(n==1){
        if(a[0]==target)
            return 0;
        else
            return -1;
}
        while(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==target){
                return mid;
            }
            else if(a[mid]>target){
                h=mid-1;
                
            }
            else{
                l=mid+1;
                
            }
            
        }
        return -1;
    }
};