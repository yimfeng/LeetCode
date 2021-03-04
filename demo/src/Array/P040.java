package Array;

import java.util.*;

public class P040 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int len = candidates.length;
        if(len == 0)
            return res;
        Deque<Integer> path = new ArrayDeque<>();
        Arrays.sort(candidates);
        dfs(candidates, 0, 0, len, path, res, target);
        return res;
    }
    private void dfs(int[] candidates, int sum, int start, int len, Deque<Integer> path, List<List<Integer>> res, int target){
        if(sum > target)
            return;
        if(sum == target){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < len; i++) {
            if(i > start && candidates[i] == candidates[i-1])
                continue;
            if(sum + candidates[i] > target)
                break;
            path.addLast(candidates[i]);
            dfs(candidates, sum+candidates[i], i+1, len, path, res, target);
            path.removeLast();
        }
    }
}
