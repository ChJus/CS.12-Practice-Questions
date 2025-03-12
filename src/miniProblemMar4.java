public class miniProblemMar4 {
  public static void main(String[] args) {
    System.out.println(maxProfit(new int[]{10, 1, 5, 6, 7, 1}));
    System.out.println(maxProfit(new int[]{10}));
    System.out.println(maxProfit(new int[]{7, 1}));
    System.out.println(maxProfit(new int[]{7, 8, 10}));
    System.out.println(maxProfit(new int[]{}));
  }

  public static int maxProfit(int[] prices) {
    int maxProfit = 0;

    // Iterate through price array, storing pointer to two elements.
    for (int i = 0; i < prices.length; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        // Store maximum profit
        maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
      }
    }

    // Return maximum profit
    return maxProfit;
  }
}
