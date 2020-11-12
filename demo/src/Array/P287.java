package Array;

import java.util.HashSet;
import java.util.Set;

public class P287 {
    public static void main(String[] args) {

    }
    // 常规方法
    public int findDuplicate(int[] nums) {
        if (nums.length == 0)
            return 0;
        HashSet<Integer> list = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            int temp = nums[i];
            if(list.contains(temp))
                return temp;
            else
                list.add(temp);
        }
        return 0;
    }
    // 剑指offer上的方法
    public int findDuplicate_1(int[] nums){
        if(nums.length == 0)
            return 0;
        for(int i=0; i<nums.length; i++)
            nums[i] = nums[i] -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i){
                if(nums[nums[i]] == i)
                    return i + 1;
                else{
                    while(nums[i] != i){
                        int temp = nums[i];
                        nums[i] = nums[nums[i]];
                        nums[nums[i]] = temp;
                    }
                }
            }
        }
        return 0;
    }
}
