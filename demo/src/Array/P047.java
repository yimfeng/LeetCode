package Array;

import java.util.*;

public class P047 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(len == 0)
            return res;
        Deque<Integer> path = new ArrayDeque<>();
        boolean[] visit = new boolean[len+1];
        Arrays.sort(nums);
        dfs(nums, path, res, visit, len);
        return res;
    }
    private void dfs(int[] nums, Deque<Integer> path, List<List<Integer>> res, boolean[] visit, int len){
        if(path.size() == len)
            res.add(new ArrayList<>(path));
        for (int i = 0; i < len; i++) {
            if(visit[i] == true)
                continue;
            if(i > 0 && nums[i] == nums[i-1] && !visit[i-1])
                continue;
            path.addLast(nums[i]);
            visit[i] = true;
            dfs(nums, path, res, visit, len);
            visit[i] = false;
            path.removeLast();
        }
    }
}
