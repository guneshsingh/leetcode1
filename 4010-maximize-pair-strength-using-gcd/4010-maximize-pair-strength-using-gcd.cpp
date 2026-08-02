class Solution {
public:
    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    long long maxPairStrength(vector<int>& nums) {
        long long maxi = LLONG_MIN;;
        long long s=0;
        for(int i=0;i<nums.size()-1;i++){
           int j=i+1;
            while(j<nums.size())
                {long long g=gcd(nums[i],nums[j]);
            s=(1LL *nums[i]*nums[j])/(g*g);
            maxi=max(s,maxi);
            j++;}
        }
        return maxi;
    }
};