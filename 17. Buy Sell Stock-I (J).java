public int maxProfit(int[] prices) {
        int minimum = prices[0];
        int profit = 0;
        for(int i = 1; i<prices.length; i++){
            int cost = prices[i] - minimum;
            profit = Math.max(cost, profit);
            minimum = Math.min(minimum, prices[i]); // dp concept used here in this step
        }
        return profit;
}
