package Array;

import java.util.LinkedList;
import java.util.List;

public class P448 {
    public static void main(String[] args) {

    }
    // 比较笨的方法，hash散列
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        int[] hashTable = new int[len+1];
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i<len; i++){
            int temp = nums[i];
            hashTable[temp] = 1;
        }
        for(int i=1; i<=len; i++){
            if(hashTable[i] == 0)
                list.add(i);
        }
        return list;
    }
    //剑指offer上面的算法
    public List<Integer> findDisappearedNumbers_1(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0; i<nums.length; i++){
            int num = Math.abs(nums[i]);
            int index = num - 1;
            if(nums[index] > 0)
                nums[index] *= -1;
        }
        for(int i=1; i<=nums.length; i++){
            if(nums[i - 1] > 0)
                list.add(i);
        }
        return list;
    }
}
