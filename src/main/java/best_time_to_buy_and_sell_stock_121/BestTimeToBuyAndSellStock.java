package best_time_to_buy_and_sell_stock_121;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            int profit = price - minPrice;
            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, price);
        }
        return maxProfit;
    }

}
