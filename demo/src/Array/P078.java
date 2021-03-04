package Array;

import java.util.*;

public class P078 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(len == 0)
            return res;
        Arrays.sort(nums);
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums, path, res, len, 0);
        return res;
    }
    private void dfs(int[] nums, Deque<Integer> path, List<List<Integer>> res, int len, int start){
        res.add(new ArrayList<>(path));
        for (int i = start; i < len; i++) {
            path.addLast(nums[i]);
            dfs(nums, path, res, len, i+1);
            path.removeLast();
        }
    }
}
