class Solution {
public:
    int maxScore(vector<int>& cardPoints, int k) {
        int leftscore=0;
        int rightscore=0;
        int maxi=0;
        for(int i=0;i<k;i++){
            leftscore+=cardPoints[i];
            maxi=leftscore;
        }
        int rightindex=cardPoints.size()-1;
        for(int j=k-1;j>=0;j--){
            leftscore-=cardPoints[j];
            rightscore+=cardPoints[rightindex];
            rightindex--;
            maxi=max(maxi,leftscore+rightscore);
        }
        return maxi;
    }
};