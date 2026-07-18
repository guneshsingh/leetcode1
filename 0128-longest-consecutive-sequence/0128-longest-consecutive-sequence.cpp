class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int l=1,count=0,ls=INT_MIN;
        int n=nums.size();
        unordered_set<int>st;
        if(n==0)
        return 0;
        for(int i=0;i<n;i++){
            st.insert(nums[i]);

        }
        for(auto it:st){
            if(st.find(it-1)==st.end()){
                int count=1;
                int x=it;
                while(st.find(x+1)!=st.end()){
                    x+=1;
                    count=count+1;
                }
                l=max(l,count);
            }
        }
return l;
    }
};