package DP;

/**
 * @author: yimfeng
 * @date: 2021-01-22 5:12 下午
 * @desc: 给定一个非负整数 num。对于 0 ≤ i ≤ num 范围中的每个数字 i ，计算其二进制数中的 1 的数目并将它们作为数组返回。
 */
public class P338 {
    public static void main(String[] args) {

    }
    // 根据基数还是偶数进行分类，当是奇数时，1的个数是前面偶数+1，当时偶数时， 1的个数是前面偶数/2的个数。
    public int[] countBits(int num) {
        int[] dp = new int[num+1];
        dp[0] = 0;
        for (int i = 1; i < num; i++) {
            if(i % 2 != 0){
                dp[i] = dp[i-1] + 1;
            }else{
                dp[i] = dp[i/2];
            }
        }
        return dp;
    }
}
