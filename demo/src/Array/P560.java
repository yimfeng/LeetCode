package Array;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class P560 {
    public static void main(String[] args) {

    }
    int sum = 0;
    public int subarraySum(int[] nums, int k) {
        int len = nums.length;
        if(len == 0)
            return 0;
        Arrays.sort(nums);
        return dfs(nums, k, 0);
    }
    private int dfs(int[] nums, int k, int start){
        if(k == 0)
            sum++;
        for (int i = 0; i < nums.length; i++) {
            if(k - nums[i] < 0)
                break;
            dfs(nums, k-nums[i], i+1);
        }
        return sum;
    }
}
