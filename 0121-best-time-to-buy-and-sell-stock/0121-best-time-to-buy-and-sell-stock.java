class Solution {

    //prices = [7,1,5,3,6,4]
    public int maxProfit(int[] prices) {
        int max_profit =0;
        int min_price = prices[0];
        for(int i = 0; i<prices.length; i++){
            min_price = Math.min(min_price,prices[i]);
            int diff = prices[i] - min_price;
            max_profit = Math.max(diff,max_profit);
        }
        return max_profit;
    }
}