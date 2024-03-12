class Solution {
    public int maxProfit(int[] prices) {
        int ans = 0;
        int temp = 0;
        
        for (int i = 0; i<(prices.length-1); i++) {
            temp = (prices[i+1] > prices[i]? prices[i+1]-prices[i] : 0);
            ans += temp;
        }
        return ans;
    }
}