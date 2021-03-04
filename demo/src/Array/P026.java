package Array;

public class P026 {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len == 0)
            return 0;
        int j = 0;
        for (int i = 1; i < len; i++) {
            if(nums[i] != nums[j])
                nums[++j] = nums[i];
        }
        return j+1;
    }
}
