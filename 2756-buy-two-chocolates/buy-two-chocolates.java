class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int amount = money;
        int chocoCount = 0; 
        for(int i = 0 ; i < prices.length ;i++){

            if(money - prices[i] >= 0){
                money = money - prices[i];
                chocoCount++;
                if(chocoCount == 2){
                  return money;
                }
            }else{
                break;
            }
        }
        if(chocoCount < 2){
            return amount;
        }

        return money;
    }
}