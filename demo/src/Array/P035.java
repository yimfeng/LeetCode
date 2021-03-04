package Array;

public class P035 {
    public static void main(String[] args) {

    }
    // 自己写的方法
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0)
            return 0;
        int key = 0;
        boolean flag = false;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                key = i;
                flag = true;
            }
        }
        if(flag == true)
            return key;
        else{
            if(target < nums[0])
                return 0;
            else if(target > nums[nums.length - 1])
                return nums.length;
            else
                for(int i=0; i<nums.length - 1; i++){
                    if(nums[i] < target && nums[i+1] > target)
                        key = i + 1;
                }
        }
        return key;
    }
    //二分法
    public int searchInsert_1(int[] nums, int target) {
        int len = nums.length;
        if(len == 0)
            return 0;
        int left = 0, right = len-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(nums[mid] > target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }
}
