package best_time_to_buy_and_sell_stock_121;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {

    @Test
    void testMaxProfit() {
        BestTimeToBuyAndSellStock stock = new BestTimeToBuyAndSellStock();

        // Test case 1: Typical case
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        assertEquals(5, stock.maxProfit(prices1)); // Buy at 1, sell at 6

        // Test case 2: No profit
        int[] prices2 = {7, 6, 4, 3, 1};
        assertEquals(0, stock.maxProfit(prices2)); // Prices decrease continuously

        // Test case 3: Constant prices
        int[] prices3 = {3, 3, 3, 3, 3};
        assertEquals(0, stock.maxProfit(prices3)); // No profitable transaction

        // Test case 4: Single price
        int[] prices4 = {5};
        assertEquals(0, stock.maxProfit(prices4)); // Only one price, no trade possible

        // Test case 5: Prices increase continuously
        int[] prices5 = {1, 2, 3, 4, 5};
        assertEquals(4, stock.maxProfit(prices5)); // Buy at 1, sell at 5

        // Test case 6: Minimum at the end
        int[] prices6 = {3, 6, 1, 5, 2};
        assertEquals(4, stock.maxProfit(prices6)); // Buy at 1, sell at 5
    }
}
