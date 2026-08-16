class Solution {
    public 
    boolean can(int[] position,int mid,int m){
        int count=1,last=position[0];
        for(int i=0;i<position.length;i++){
            if(position[i]-last>=mid){
                count++;
                last=position[i];
            }
            if(count>=m) return true;
        }
        return false;
    }
    int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=1,h=position[position.length-1]-position[0];
        while(l<=h){
            int mid=l+(h-l)/2;
            if(can(position,mid,m)) l=mid+1;
            else h=mid-1;
        }
        return h;
    }
}