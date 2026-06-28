class Solution {
public:
    string multiply(string num1, string num2) {
        if (num1 == "0" || num2 == "0")
            return "0";

        vector<int> ans(num1.size() + num2.size(), 0);

        for (int i = num1.size() - 1; i >= 0; i--) {
            for (int j = num2.size() - 1; j >= 0; j--) {
                int product = (num1[i] - '0') * (num2[j] - '0');

                ans[i + j + 1] += product;
                ans[i + j] += ans[i + j + 1] / 10;
                ans[i + j + 1] %= 10;
            }
        }

        string res = "";
        for (int x : ans) {
            if (!(res.empty() && x == 0))
                res += (x + '0');
        }

        return res;
    }
};