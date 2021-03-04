package Array;

import java.util.*;

public class P090 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(len == 0)
            return res;
        Deque<Integer> path = new ArrayDeque<>();
        Arrays.sort(nums);
        dfs(nums, res, path, len, 0);
        return res;
    }
    private void dfs(int[] nums, List<List<Integer>> res, Deque<Integer> path, int len, int start){
        res.add(new ArrayList<>(path));
        for (int i = start; i < len; i++) {
            if(i > start && nums[i] == nums[i-1])
                continue;
            path.addLast(nums[i]);
            dfs(nums, res, path, len, i+1);
            path.removeLast();
        }
    }
}
