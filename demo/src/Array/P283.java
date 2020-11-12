package Array;

public class P283 {
    public static void main(String[] args) {

    }
    public void moveZeroes(int[] nums) {
        int i = 0;
        for(int j = 0; i < nums.length; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }
        for(int p = i; p < nums.length; p++)
            nums[p] = 0;
    }
}
