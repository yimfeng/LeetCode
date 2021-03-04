package Array;

import java.util.Map;

/**
 * @author: yimfeng
 * @date: 2021-02-17 9:16 上午
 * @desc: 寻找旋转排序数组中的最小值
 */
public class P153 {
    public static void main(String[] args) {

    }
    public int findMin(int[] nums) {
        int mymin = 5001;
        int len = nums.length;
        if(len == 1)
            return nums[0];
        int left = 0, right = len-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[left]){
                mymin = Math.min(mymin, nums[left]);
                left = mid + 1;
            }
            else if(nums[mid] < nums[left]){
                mymin = Math.min(mymin, nums[right]);
                right = mid;
            }
            else
                return Math.min(nums[right], Math.min(mymin, nums[left]));
        }
        return mymin;
    }
}
