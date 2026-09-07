class Solution {
public:
    bool rotateString(string s, string goal) {
        if(s.length()!=goal.length()) return false;
        string r=s+s;
        return r.find(goal) != string::npos;
    }
};