package Array;

public class P238 {
    public static void main(String[] args) {

    }
    // 方法一
    public int[] productExceptSelf(int[] nums) {
        int[] L = new int[nums.length];
        int[] R = new int[nums.length];
        int index = 1;
        L[0] = 1;
        R[nums.length - 1] = 1;
        for(int i=1; i<nums.length; i++){
            L[i] = L[i-1] * nums[i-1];
        }
        for(int i=nums.length - 2; i>=0; i--){
            R[i] = R[i+1] * nums[i+1];
        }
        for(int i=0; i<nums.length; i++){
            L[i] *= R[i];
        }
        return L;
    }
    // 方法二
    public int[] productExceptSelf_1(int[] nums) {
        int[] ans = new int[nums.length];
        int index = 1;
        ans[0] = 1;
        for(int i=1; i<nums.length; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }
        for(int i=nums.length-1; i>=0; i--){
            ans[i] = ans[i] * index;
            index = index * nums[i];
        }
        return ans;
    }
}
