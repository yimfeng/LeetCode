package Array;

import java.util.HashMap;

public class P209 {
    public static void main(String[] args) {

    }
    /*
    209. 长度最小的子数组
    给定一个含有 n 个正整数的数组和一个正整数 s ，
    找出该数组中满足其和 ≥ s 的长度最小的连续子数组，
    并返回其长度。如果不存在符合条件的子数组，返回 0。
    输入：s = 7, nums = [2,3,1,2,4,3]
    输出：2
    解释：子数组 [4,3] 是该条件下的长度最小的子数组。
     */
    public int minSubArrayLen(int s, int[] nums) {
        int len = nums.length;
        if(len == 0)
            return 0;
        int left = 0;
        int sum = 0;
        int min = len;
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            sum = sum + nums[i];
            while(sum > s){
                flag = true;
                min = Math.min(min, i-left+1);
                sum = sum - nums[left];
                left = left + 1;
            }
            if(sum == s){
                flag = true;
                min = Math.min(min, i-left+1);
                sum = sum - nums[left];
                left = left + 1;
            }
        }
        if(flag == false)
            return 0;
        return min;
    }
}
