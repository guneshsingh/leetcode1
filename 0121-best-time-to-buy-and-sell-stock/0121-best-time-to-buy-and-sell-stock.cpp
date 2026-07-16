class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size(),mini=prices[0],cost=0,maxi=0;
        for(int i=1;i<n;i++){
            cost=prices[i]-mini;
            maxi=max(cost,maxi);
            mini=min(mini,prices[i]);
        }
return maxi;
    }
};