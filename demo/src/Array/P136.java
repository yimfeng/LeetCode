package Array;

import java.util.Arrays;

/**
 * @author: yimfeng
 * @date: 2021-01-22 10:44 上午
 * @desc: 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */
public class P136 {
    public static void main(String[] args) {

    }
    // 暴力解法
    public int singleNumber(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        for (int i = 1; i < len; i++) {
            if(nums[i] != nums[i-1])
                return nums[i-1];
            i++;
        }
        return nums[len-1];
    }

    // 异或操作
    public int singleNumber_1(int[] nums) {
        int single = 0;
        for(int num : nums){
            single ^= num;
        }
        return single;
    }
}
