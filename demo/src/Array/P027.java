package Array;

public class P027 {
    public static void main(String[] args) {

    }
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        if(len == 0)
            return 0;
        int j = 0;
        for (int i = 0; i < len; i++) {
            if(nums[i] != val)
                nums[j++] = nums[i];
        }
        return j;
    }
}
