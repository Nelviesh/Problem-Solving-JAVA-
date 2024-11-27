class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Initialize minimum price to a very high value
        int maxProfit = 0;               // Initialize maximum profit to 0

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;        // Update the minimum price if a lower price is found
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // Calculate and update max profit
            }
        }

        return maxProfit;
    }
}
