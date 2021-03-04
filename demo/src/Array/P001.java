package Array;

import java.util.HashMap;
import java.util.Map;

public class P001 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            int value = nums[i];
            map.put(target - value, i);
        }
        for (int i = 0; i < len; i++) {
            int value = nums[i];
            if(map.containsKey(value) && map.get(value) != i){
                return new int[]{map.get(value), i};
            }
        }
        return new int[]{0,0};
    }
}
