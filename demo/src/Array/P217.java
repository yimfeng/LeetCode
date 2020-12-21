package Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class P217 {
    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] nums) {
        if(nums.length == 0)
            return false;
        for (int i = 0; i < nums.length; i++) {
            nums[i]--;
            if(nums[i] != i && nums[nums[i]] == i)
                return true;
            while(nums[i] != i){
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return false;
    }
    public boolean containsDuplicate_1(int[] nums){
        if(nums.length == 0)
            return false;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i]))
                return true;
        }
        return false;
    }
}
