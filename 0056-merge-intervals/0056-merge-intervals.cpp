class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        int n=intervals.size();
        sort(intervals.begin(),intervals.end());
        vector<vector<int>> m;
        for(int i=0;i<n;i++){
            if(m.empty() || intervals[i][0]>m.back()[1])
            {m.push_back(intervals[i]);}
            else{
                m.back()[1]=max(m.back()[1],intervals[i][1]);
            }
        }
        return m;
    }
};