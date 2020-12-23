package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2020-12-23 12:46 下午
 * @desc:  在排序数组中查找数字 I
 */
public class P053_1 {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int len = nums.length;
        if(len == 0)
            return 0;
        int start = 1;
        int end = 0;
        if(nums[0] == target)
            start = 0;
        for (int i = 1; i < len; i++) {
            if(nums[i] == target && nums[i-1] != target)
                start = i;
            if(i != len-1){
                if(nums[i] == target && nums[i+1] != target)
                    end = i;
            }
            if(i == len-1 && nums[i] == target)
                end = len-1;
        }
        return end - start + 1;
    }
}
