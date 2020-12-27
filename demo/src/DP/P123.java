package DP;

/**
 * @author: yimfeng
 * @date: 2020-12-26 1:40 下午
 * @desc: 买卖股票的最佳时机 III
 */
public class P123 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
            return 0;
        int len = prices.length;
        int[][][] dp = new int[len][3][2];
        dp[0][1][0] = 0;
        dp[0][1][1] = -prices[0];
        dp[0][2][0] = 0;
        dp[0][2][1] = -prices[0];
        for (int i = 1; i < len; i++) {
            dp[i][2][0] = Math.max(dp[i-1][2][0], dp[i-1][2][1] + prices[i]);
            dp[i][2][1] = Math.max(dp[i-1][2][1], dp[i-1][1][0] - prices[i]);
            dp[i][1][0] = Math.max(dp[i-1][1][0], dp[i-1][1][1] + prices[i]);
            dp[i][1][1] = Math.max(dp[i-1][1][1], dp[i-1][0][0] - prices[i]);
        }
        return dp[len-1][2][0];
    }
}
