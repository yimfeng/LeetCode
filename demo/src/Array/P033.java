package Array;

/**
 * @author: yimfeng
 * @date: 2021-02-15 10:14 下午
 * @desc: 搜索旋转排序数组
 */
public class P033 {
    public static void main(String[] args) {

    }
    public int search(int[] nums, int target) {
        int len = nums.length;
        if(len == 0)
            return 0;
        int i = 0, j = len-1;
        while (i <= j){
            int mid = (i+j)/2;
            if(nums[mid] == target)
                return mid;
            if(nums[0] <= nums[mid]){
                if(nums[0] <= target && target < nums[mid])
                    j = mid - 1;
                else
                    i = mid + 1;
            }
            else{
                if(nums[mid] < target && target <= nums[len-1])
                    i = mid + 1;
                else
                    j = mid - 1;
            }
        }
        return -1;
    }
}
