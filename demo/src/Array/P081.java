package Array;

/**
 * @author: yimfeng
 * @date: 2021-02-16 4:14 下午
 * @desc: 搜索旋转排序数组 II
 */
public class P081 {
    public static void main(String[] args) {

    }
    public boolean search(int[] nums, int target) {
        int len = nums.length;
        if(len == 0)
            return false;
        int left = 0, right = len-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[left] < nums[mid]){
                if(nums[left] <= target && target < nums[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            }
            else if(nums[left] > nums[mid]){
                if(nums[mid] < target && target <= nums[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            else{
                if(nums[left] == target)
                    return true;
                else
                    left = left + 1;
            }
        }
        return nums[left] == target;
    }
}
