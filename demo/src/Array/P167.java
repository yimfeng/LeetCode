package Array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: yimfeng
 * @date: 2021-02-03 8:13 下午
 * @desc: 两数之和 II - 输入有序数组
 * @方法：双指针
 */
public class P167 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int p = 0, q = len-1;
        while(p <= q){
            if(numbers[p] + numbers[q] == target)
                return new int[]{p,q};
            else if(numbers[p] + numbers[q] < target)
                p++;
            else if(numbers[p] + numbers[q] > target)
                q--;
        }
        return new int[]{-1,-1};
    }
}
