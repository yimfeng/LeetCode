package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2020-12-23 10:55 上午
 * @desc: 股票的最大利润
 * 动态规划：求前n项的最小值，然后和当前项进行比较
 */
public class P063 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int max_earn = 0;
        int mymin = 10000;
        for (int i = 0; i < len; i++) {
            if(prices[i] < mymin)
                mymin = prices[i];
            max_earn = Math.max(max_earn, prices[i] - mymin);
        }
        return max_earn;
    }
}
