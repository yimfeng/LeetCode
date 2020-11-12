package Array;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

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
    private void dfs(int[] nums, int len, int begin, Deque<Integer> path, List<List<Integer>> res){
        res.add(new ArrayList<>(path));
        for (int i = begin; i < len; i++) {
            path.addLast(nums[i]);
            dfs(nums, len, i + 1, path, res);
            // 回溯
            path.removeLast();
        }
    }
}
