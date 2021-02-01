package Recall;

import java.util.*;

/**
 * @author: yimfeng
 * @date: 2021-01-31 5:17 下午
 * @desc:
 */
public class P090 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> subsetsWithDup(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(len == 0)
            return res;
        Deque<Integer> path = new ArrayDeque<>();
        Arrays.sort(nums);
        dfs(nums, 0, len, path, res);
        return res;
    }
    private void dfs(int[] nums, int start, int len, Deque<Integer> path, List<List<Integer>> res){
        res.add(new ArrayList<>(path));
        for (int i = start; i < len; i++) {
            if(i > start && nums[i] == nums[i-1])
                continue;
            path.addLast(nums[i]);
            dfs(nums, start+1, len, path, res);
            path.removeLast();
        }
    }
}
