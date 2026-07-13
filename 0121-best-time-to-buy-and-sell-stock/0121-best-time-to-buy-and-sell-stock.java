class Solution {
    public int maxProfit(int[] prices) {
        int p = prices.length;
        if(prices == null || prices.length < 2){
            return 0;
        }
        int price = prices[0];
        int profit = 0;

        for(int i = 0 ; i < prices.length ; i++){
            if(prices[i] < price){
                price = prices[i];
            }
            else if(prices[i] - price > profit){
                profit = prices[i] - price;

            }
        }
    return profit;
    }
}