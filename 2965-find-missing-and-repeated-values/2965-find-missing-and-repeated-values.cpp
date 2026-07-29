class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        long long n=grid.size()*grid.size();
        long long s=0,s2=0;
        long long sn=(n*(n+1))/2;
        long long s2n=(n*(n+1)*(2*n+1))/6;
        
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid.size();j++){
                s+=grid[i][j];
                s2+=grid[i][j]*grid[i][j];
            }
        }
        long long first=s-sn;
        long long second=s2-s2n;
        second=second/first;
        long long x=(first+second)/2;
        long long y=x-first;
        return {(int)x,(int)y};
        
    }
};