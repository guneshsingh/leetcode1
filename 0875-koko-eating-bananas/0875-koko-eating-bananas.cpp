class Solution {
public:
int find_max(vector<int>& piles){
    int maxi=INT_MIN;
    int n=piles.size();
    for(int i=0;i<n;i++){
        maxi=max(maxi,piles[i]);
    }
    return maxi;
}
long long thours(vector<int>& piles,int h){
    long long k=0;
    int n=piles.size();
    for(int i=0;i<n;i++){
        k+=ceil((double) piles[i]/(double) h);

    }
    return k;
}
    int minEatingSpeed(vector<int>& piles, int h) {
        int l=1,hi=find_max(piles);
        while(l<=hi){
            int mid=l+(hi-l)/2;
            long long total=thours(piles,mid);
            if(total<=h){
                hi=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
};