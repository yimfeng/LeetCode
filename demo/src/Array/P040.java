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
        Arrays.sort(candidates);
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates, target, len, 0, path, res);
        return res;
    }
    private void dfs(int[] candidates, int target, int len, int start, Deque<Integer> path, List<List<Integer>> res){
        if(target == 0)
            res.add(new ArrayList<>(path));
        for (int i = start; i < len; i++) {
            //剪枝
            if(target - candidates[i] < 0){
                break;
            }
            if(i > start && candidates[i] == candidates[i-1])
                continue;
            path.addLast(candidates[i]);
            dfs(candidates, target - candidates[i], len, i + 1, path, res);
            path.removeLast();
        }
    }
}
