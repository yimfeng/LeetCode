package Array;

/**
 * @author: yimfeng
 * @date: 2021-02-17 9:48 上午
 * @desc:
 */
public class P154 {
    public int findMin(int[] nums) {
        int mymin = 5001;
        int len = nums.length;
        if(len == 1)
            return nums[0];
        int left = 0, right = len-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] > nums[left]){
                left = mid + 1;
            }
            else if(nums[mid] < nums[left]){
                right = mid;
            }
            else
                right--;
        }
        return nums[left];
    }
}
