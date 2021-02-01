package Recall;

import java.util.*;

/**
 * @author: yimfeng
 * @date: 2021-01-31 3:52 下午
 * @desc:
 */
public class P047 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(len == 0)
            return res;
        boolean[] visit = new boolean[len];
        for (int i = 0; i < len; i++) {
            visit[i] = false;
        }
        Arrays.sort(nums);
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums, 0, len, visit, path, res);
        return res;
    }
    private void dfs(int[] nums, int depth, int len, boolean[] visit, Deque<Integer> path, List<List<Integer>> res){
        if(depth == len)
            res.add(new ArrayList<>(path));
        for (int i = 0; i < len; i++) {
            if(i > 0 && nums[i] == nums[i-1] && visit[i-1] == false)
                continue;
            if(visit[i] == false){
                path.addLast(nums[i]);
                visit[i] = true;
                dfs(nums, depth+1, len, visit, path, res);
                visit[i] = false;
                path.removeLast();
            }
        }
    }
}
