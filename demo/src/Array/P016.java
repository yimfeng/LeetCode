package Array;

import java.util.Arrays;

public class P016 {
    public static void main(String[] args) {

    }
    public int threeSumClosest(int[] nums, int target) {
        int ans = 0;
        int min = target;
        int len = nums.length;
        if(len == 0)
            return 0;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {
            if(i>0 && nums[i] == nums[i-1])
                continue;
            int p = i+1, q = len-1;
            while(p<q){
                int sum = nums[i] + nums[p] + nums[q];
                if(Math.abs(sum - target) < min){
                    min = Math.abs(sum - target);
                    ans = sum;
                    while(p < q && nums[p] == nums[p+1]){
                        p++;
                    }
                    while(p < q && nums[q] == nums[q-1]){
                        q--;
                    }
                }
                else{
                    if(sum < target)
                        p++;
                    else
                        q++;
                }
            }
        }
        return ans;
    }
}
