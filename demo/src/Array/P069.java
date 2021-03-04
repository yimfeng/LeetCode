package Array;

/**
 * @author: yimfeng
 * @date: 2021-02-17 10:33 上午
 * @desc: x 的平方根
 */
public class P069 {
    public static void main(String[] args) {

    }
    public int mySqrt(int x) {
        if(x == 0)
            return 0;
        long left = 0, right = x/2+1;
        while(left < right){
            long mid = left + (right - left + 1)/2;
            long num = mid * mid;
            if(num > x)
                right = mid - 1;
            else
                left = mid;
        }
        return (int)left;
    }
}
