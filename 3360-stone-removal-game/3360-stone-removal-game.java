class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        boolean ans=true;
        int curr=n-10;
        int first=10;
        int turn=0;
        while(curr>0){
            first--;
            if(curr>first){
                curr-=first;
                turn++;
            }
            else if(curr==first){
                return turn%2==0?false:true;
            }
            else{
                return turn%2==0?true:false;
            
            }
        }
        return ans;

    }
}