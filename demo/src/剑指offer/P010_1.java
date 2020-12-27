package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2020-12-25 10:01 上午
 * @desc: 斐波那契数列
 */
public class P010_1 {
    public static void main(String[] args) {

    }
    // 时间比较长
    public int fib(int n) {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }
    public int fib_1(int n){
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        int[] nums = new int[n+1];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            nums[i] = nums[i-1]%1000000007 + nums[i-2]%1000000007;
        }
        return nums[n]%1000000007;
    }
}
