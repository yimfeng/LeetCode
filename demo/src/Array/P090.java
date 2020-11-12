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
        dfs(nums, 0, path, res);
        return res;
    }
    private void dfs(int[] nums, int start, Deque<Integer> path, List<List<Integer>> res){
        res.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {

            if(i > start && nums[i] == nums[i-1]) //保证不会出现重复的数据
                continue;

            path.addLast(nums[i]);
            dfs(nums, i+1, path, res);
            path.removeLast();
        }
    }
}
