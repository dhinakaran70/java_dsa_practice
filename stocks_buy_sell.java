public class stocks_buy_sell {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(find_profit(prices));
    }
        public static int find_profit(int[] prices) {
            int minPrice = Integer.MAX_VALUE;
            int maxProfit = 0;

            for (int i=0;i<prices.length;i++) {
                // Update the minimum price so far
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                }
                // Calculate the potential profit
                int profit = prices[i] - minPrice;
                // Update the maximum profit found so far
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }

            return maxProfit;
        }
}
