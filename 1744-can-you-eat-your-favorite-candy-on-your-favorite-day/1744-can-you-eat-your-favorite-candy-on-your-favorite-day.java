class Solution {
    public boolean[] canEat(int[] candiesCount, int[][] queries) {
        boolean[] answer=new boolean[queries.length];
        long [] prefixsum=new long[candiesCount.length];
        prefixsum[0]=candiesCount[0];
        for(int i=1;i<candiesCount.length;i++){
            prefixsum[i]=prefixsum[i-1]+candiesCount[i];
        }
        int i=0;
        for(int[] query:queries){
            int favcandy=query[0];
            long favday=query[1];
            long dailyCap=query[2];
            long totalCandiesToBeEaten=(favcandy==0)?0:prefixsum[favcandy-1];
            if((favday+1)*dailyCap<=totalCandiesToBeEaten){
                answer[i]=false;
            }
            else if((favday+1)>prefixsum[favcandy]){
                answer[i]=false;
            }
            else{
                answer[i]=true;
            }
            i++;
        }
        return answer;
    }
}