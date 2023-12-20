class Solution {
    public int buyChoco(int[] prices, int money) {
        int min1 = Integer.MAX_VALUE ;
        int min2 = Integer.MAX_VALUE ;

        for(int i = 0 ; i < prices.length ; i++){
            min1 = Math.min(min1 , prices[i]);
        }
        int idx = 0 ;
        for(int i = 0 ; i< prices.length ; i++){
            if(prices[i] == min1){
                 idx = i;
                 break;
            }
        }

        for(int i = 0 ; i< prices.length ;i++){
            if(i != idx){
              min2 =   Math.min(min2 , prices[i]);
            }
        }

        int amount = money;
        if(amount - min1 >= 0){
            amount = amount - min1;
            if(amount - min2 >= 0){
               amount = amount - min2;
               return amount;
            }
        }

        return money;
    }
}