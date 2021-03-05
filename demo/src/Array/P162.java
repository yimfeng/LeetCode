package Array;

/**
 * @author: yimfeng
 * @date: 2021-03-04 6:40 下午
 * @desc:
 */
public class P162 {
    public static void main(String[] args) {

    }

    public int findPeakElement(int[] nums) {
        return findPeak(nums, 0, nums.length - 1);
    }
    private int findPeak(int[] nums, int left, int right) {
        if(left == right)
            return left;
        int mid = left + (right - left) / 2;
        if(nums[mid] > nums[mid+1])
            return findPeak(nums, left, mid);
        return findPeak(nums, mid+1, right);
    }
}
