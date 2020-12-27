package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2020-12-25 10:21 上午
 * @desc: 青蛙跳台阶问题
 */
public class P010_2 {
    public static void main(String[] args) {

    }
    public int numWays(int n) {
        if(n == 0 || n == 1)
            return 1;
        if(n == 2)
            return 2;
        int a = 1;
        int b = 2;
        while(n-- != 2){
            int sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return b;
    }
}
