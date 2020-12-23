package 剑指offer;

import java.util.Arrays;

/**
 * @author: yimfeng
 * @date: 2020-12-23 10:27 上午
 * @desc: 最小的k个数
 */
public class P040 {
    public static void main(String[] args) {

    }
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] nums = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            nums[i] = arr[i];
        }
        return nums;
    }
}
