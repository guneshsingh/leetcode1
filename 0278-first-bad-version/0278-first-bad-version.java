/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=1;
        int right=n;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            boolean curr=isBadVersion(mid);
            if(curr){
                
                right=mid-1;
            }
            else if(!curr){
                left=mid+1;
            }
            
        }
        return left;
    }
}