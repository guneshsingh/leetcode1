class Solution {
public:
    bool canConstruct(string r, string m) {
        int fr[26]={0};
        for(int i=0;i<m.size();i++){
            fr[m[i] - 'a']++;
            }
        for(int j=0;j<r.size();j++){
            if(fr[r[j] - 'a']==0)
           { return false;}
        
            fr[r[j]-'a']--;
        }
        return true;
    }
};