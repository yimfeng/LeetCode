package DP;

/**
 * @author: yimfeng
 * @date: 2020-12-26 1:00 下午
 * @desc: 买卖股票的最佳时机 II
 */
public class P122 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
            return 0;
        int len = prices.length;
        int[][] dp = new int[len][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i = 1; i < len; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
        }
        return dp[len-1][0];
    }
    // 优化算法
    public int max_Profit(int[] prices){
        if(prices == null || prices.length == 0)
            return 0;
        int price0 = 0, price1 = -prices[0];
        int len = prices.length;
        for (int i = 1; i < len; i++) {
            int newProfit0 = Math.max(price0, price1 + prices[i]);
            int newProfit1 = Math.max(price1, price0 - prices[i]);
            price0 = newProfit0;
            price1 = newProfit1;
        }
        return price0;
    }
}
