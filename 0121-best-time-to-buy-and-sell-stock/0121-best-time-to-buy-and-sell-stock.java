class Solution {
    public int maxProfit(int[] prices) {
        int maxP=0;
        int mini=prices[0];
        for(int i=0; i<prices.length; i++){
            mini=Math.min(mini,prices[i]);
            int profit=prices[i]-mini;
            maxP=Math.max(maxP,profit);
        }
        return maxP;
    }
}