class Solution {
public:
    int buyChoco(vector<int>& prices, int money) {
        sort(prices.begin(),prices.end());
         int ans=(prices[0]+prices[1]>money)? money : money-(prices[0]+prices[1]);
         return ans;
    }
};