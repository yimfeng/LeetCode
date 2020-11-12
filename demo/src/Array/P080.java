package Array;

public class P080 {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int i = 0, sum = 1;
        for(int j = 0; j<nums.length; j++){
            if(nums[j] != nums[i])
                sum = 1;
            if(nums[j] != nums[i] || nums[j] ==nums[i] && sum < 2) {
                nums[i] = nums[j];
                i++;
                sum++;
            }
        }
        return i;
    }
}
