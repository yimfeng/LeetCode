package DP;

/**
 * @author: yimfeng
 * @date: 2020-12-26 12:36 下午
 * @desc: 买卖股票的最佳时机
 */
public class P121 {
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
            dp[i][1] = Math.max(dp[i-1][1], -prices[i]);
        }
        return dp[len-1][0];
    }
}
