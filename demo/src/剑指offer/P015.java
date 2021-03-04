package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2021-03-03 8:34 上午
 * @desc:
 */
public class P015 {
    public static void main(String[] args) {

    }
    public int hammingWeight(int n) {
        int count = n;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }
}
