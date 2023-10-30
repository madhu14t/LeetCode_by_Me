class Solution {
public:
    vector<int> finalPrices(vector<int>& prices) {
        vector<int> ans(prices.size());
        stack<int> s;
        for (int i = 0; i < prices.size(); i++) {
            while (!s.empty() && prices[s.top()] >= prices[i]) {
                ans[s.top()] = prices[s.top()] - prices[i];
                s.pop();
            }
            s.push(i);
        }
        
        while (!s.empty()) {
            ans[s.top()] = prices[s.top()];
            s.pop();
        }
        
        return ans;
    }
};
