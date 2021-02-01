package Recall;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author: yimfeng
 * @date: 2021-01-30 7:44 下午
 * @desc: 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 */
public class P078 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(len == 0)
            return res;
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums, len, 0, path, res);
        return res;
    }
    private void dfs(int[] nums, int len, int start, Deque<Integer> path, List<List<Integer>> res){
        res.add(new ArrayList<>(path));
        for (int i = start; i < len; i++) {
            path.addLast(nums[i]);
            dfs(nums, len, i+1, path, res);
            path.removeLast();
        }
    }
}
