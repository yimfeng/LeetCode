package Hash;

import java.util.HashMap;

public class P001 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        int[] ans = new int[len];
        for (int i = 0; i < len; i++) {
            if(map.containsKey(target - nums[i]))
                return new int[]{map.get(target - nums[i]), i};
            map.put(nums[i], i);
        }
        return ans;
    }
}
