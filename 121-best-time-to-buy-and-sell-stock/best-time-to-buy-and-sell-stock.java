class Solution {
    public int maxProfit(int[] prices) {
        
        if(prices.length < 2){
            return 0;
        }

        int profit = 0 ;
        int min = 999999999;

        for(int i =  0 ; i <prices.length ; i++){
            if(prices[i] < min){
                min = prices[i];
            }

            profit = Math.max(profit, prices[i] - min);
        }
        
        return profit;
    }
}