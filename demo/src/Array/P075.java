package Array;

public class P075 {
    public static void main(String[] args) {

    }
    public void sortColors(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return;
        }
        int zero = 0;
        int two = len;
        int i = 0;
        while (i < two) {
            if (nums[i] == 0) {
                swap(nums, i, zero);
                zero++;
                i++;
            } else if (nums[i] == 1) {
                i++;
            } else {
                two--;
                swap(nums, i, two);
            }
        }
    }

    private void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
