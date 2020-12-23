package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2020-12-23 10:35 上午
 * @desc: 连续子数组的最大和
 * 求sum序列的值
 */
public class P042 {
    public static void main(String[] args) {

    }
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int[] sum = new int[len];
        sum[0] = nums[0];
        int mymax = nums[0];
        for (int i = 1; i < len; i++) {
            sum[i] = Math.max(nums[i], sum[i-1] + nums[i]);
            if(sum[i] < mymax)
                mymax = sum[i];
        }
        for (int i = 0; i < len; i++) {
            if(sum[i] > mymax)
                mymax = sum[i];
        }
        return mymax;
    }
}
