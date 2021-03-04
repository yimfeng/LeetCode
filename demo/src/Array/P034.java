package Array;

/**
 * @author: yimfeng
 * @date: 2021-02-16 9:51 上午
 * @desc:
 */
public class P034 {
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target) {
        int len = nums.length;
        if(len == 0)
            return new int[]{-1,-1};
        int left = 0, right = nums.length - 1;
        left = findFirst(nums, target, left, right);
        if(left == -1)
            return new int[]{-1, -1};
        right = findLast(nums, target, left, right);
        return new int[]{left, right};
    }
    private int findFirst(int[] nums, int target, int left, int right){
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] < target)
                left = mid + 1;
            else if(nums[mid] == target)
                right = mid;
            else
                right = mid - 1;
        }
        if(nums[left] == target)
            return left;
        return -1;
    }

    private int findLast(int[] nums, int target, int left, int right){
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] > target)
                right = mid - 1;
            else if(nums[mid] == target)
                left = mid;
            else
                left = mid + 1;
        }
        return right;
    }
}
