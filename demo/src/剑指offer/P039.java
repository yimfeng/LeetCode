package 剑指offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author: yimfeng
 * @date: 2020-12-22 8:04 下午
 * @desc:
 */
public class P039 {
    public static void main(String[] args) {

    }
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            map.put(nums[i], 0);
        }
        for (int i = 0; i < len; i++) {
            int temp = nums[i];
            int num = map.get(temp);
            if(2*num + 2 > len)
                return temp;
            map.put(temp, ++num);
        }
        return 0;
    }
}
