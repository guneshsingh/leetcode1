class Solution {
public:
    int romanToInt(string s) {
        int res=0;
        map<char,int>mpp;
        mpp={{'I', 1}, {'V', 5}, {'X', 10},{'L', 50}, {'C', 100}, {'D', 500}, {'M',1000}};
    for(int i=0;i<s.size();i++){
        if(mpp[s[i]]<mpp[s[i+1]]) res-=mpp[s[i]];
        else  res+=mpp[s[i]];
    }
    return res;
    }
};