package 剑指offer;

public class P003 {
    public static void main(String[] args) {

    }
    public int findRepeatNumber(int[] nums) {
        if(nums.length == 0)
            return 0;
        for (int i = 0; i < nums.length; i++) {
            while(nums[i] != i){
                if(nums[i] == nums[nums[i]])
                    return nums[i];
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return 0;
    }
}
