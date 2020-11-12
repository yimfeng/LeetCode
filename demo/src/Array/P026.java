package Array;

public class P026 {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0)
            return 0;
        int p = 0;
        for(int q = 1; q < nums.length; q++){
            if(nums[q] != nums[p]){
                p++;
                nums[p] = nums[q];
            }
        }
        return p+1;
    }
}
