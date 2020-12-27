package Array;

/**
 * @author: yimfeng
 * @date: 2020-12-26 10:47 上午
 * @desc: 买卖股票的最佳时机 II
 */
public class P122 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[] dp = new int[len];
        int min = prices[0];
        int ans = 0;
        int index = 0;
        for (int i = 1; i < len; i++) {
            if(prices[i] < min){
                min = prices[i];
                index = i;
            }
            dp[i] = dp[i] - min;
        }
        for (int i = 0; i < len; i++) {
            if(dp[i] > ans){
                ans = dp[i];
            }
        }
        return ans;
    }
}
