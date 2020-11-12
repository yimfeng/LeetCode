package Array;

import java.util.*;

public class P039 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int len = candidates.length;
        if(len == 0 || target == 0)
            return res;
        Arrays.sort(candidates); // 先进行排序，然后进行剪枝
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates, target, 0, len, res, path);
        return res;
    }
    private void dfs(int[] candidates, int target, int begin, int len, List<List<Integer>> res, Deque<Integer> path){
        if(target == 0){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < len; i++) {
            // 剪枝操作
            if(target - candidates[i] < 0){
                break;
            }

            path.addLast(candidates[i]);
            dfs(candidates, target - candidates[i], i, len, res, path);
            path.removeLast();
        }
    }
}
