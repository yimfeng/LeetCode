package Array;

/**
 * @author: yimfeng
 * @date: 2021-03-04 3:25 下午
 * @desc:
 */
public class P050 {
    public static void main(String[] args) {

    }
    private double quickMul(double x, long N){
        if(N == 0)
            return 1.0;
        double y = quickMul(x, N >> 1);
        return N % 2 == 0 ? y * y : y * y * x;
    }
    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }
}
