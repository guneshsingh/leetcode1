class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] ls=new int[n];
        for(int[] booking:bookings){
            ls[booking[0]-1]+=booking[2];
            if(booking[1]<n){
                ls[booking[1]]-=booking[2];
            }}
            for(int i=1;i<n;i++){
                ls[i]+=ls[i-1];
            
        }
        return ls;
    }
}