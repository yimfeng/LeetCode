package 剑指offer;

import java.util.HashMap;

/**
 * @author: yimfeng
 * @date: 2020-12-25 9:35 上午
 * @desc: 和为s的两个数字
 */
public class P057 {
    public static void main(String[] args) {

    }
    // 此时没有考虑数组是排序数组
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];
            map.put(nums[i], value);
            if(map.containsKey(value)){
                index[0] = nums[i];
                index[1] = value;
            }
        }
        return index;
    }
    // 双指针法
    public int[] twoSum_1(int[] nums, int target) {
        int len = nums.length;
        int p = 0;
        int q = len-1;
        while(p < q){
            if(nums[p] + nums[q] > target)
                q--;
            if(nums[p] + nums[q] < target)
                p++;
            if(nums[p] + nums[q] == target)
                return new int[] {nums[p], nums[q]};
        }
        return new int[0];
    }
}
