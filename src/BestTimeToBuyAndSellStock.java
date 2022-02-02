public class BestTimeToBuyAndSellStock {  // d = 2  b = 1
    public int maxProfit(int[] prices) { // [7,1,5,3,6,4]
        int day = 0, buy = prices[0], sell;
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) {
                day = i;
                buy = prices[i];
            }
        }
        sell = buy;

        for (int i = day; i < prices.length; i++) {
            if (prices[i] > sell) sell = prices[i];
        }

        return sell - buy;
    }
}

// BEST SOLUTION
/*
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = Integer.MAX_VALUE;
        for(int price: prices){
            buy = Math.min(buy, price);
            profit = Math.max(profit,(price-buy));
        }
        return profit;
    }

 */
