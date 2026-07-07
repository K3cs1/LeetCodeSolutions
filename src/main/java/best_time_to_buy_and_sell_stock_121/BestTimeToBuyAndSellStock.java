package best_time_to_buy_and_sell_stock_121;

public class BestTimeToBuyAndSellStock {

	public int maxProfit( int[] prices ) {
		int left = 0; //buy
		int right = 1; //sell
		int maxProfit = 0;
		while ( right < prices.length ) {
			if ( prices[ left ] < prices[ right ] ) {
				int profit = prices[ right ] - prices[ left ];
				maxProfit = Math.max( maxProfit, profit );
			} else {
				left = right;
			}
			right++;
		}
		return maxProfit;
	}

}
