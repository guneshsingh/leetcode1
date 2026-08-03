class Solution {
    public int searchInsert(int[] a, int target) {
        int n=a.length;
        int l=0,h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==target){
                return  mid;

            }
            else if(a[mid]<target){
                l=mid+1;

            }
            else{
                h=mid-1;
            }
        }
        return l;
    }
}