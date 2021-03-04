package Array;

import java.util.*;

public class P039 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        int len = candidates.length;
        if(len == 0) {
            return res;
        }
        Deque<Integer> path = new ArrayDeque<>();
        Arrays.sort(candidates);
        dfs(candidates,0,  0, target, res, path, len);
        return res;
    }
    private void dfs(int[] candidates, int sum, int start, int target, List<List<Integer>> res, Deque<Integer> path, int len){
        if(sum > target)
            return;
        if(sum == target){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i < len; i++) {
            if(sum + candidates[i] > target)
                break;
            path.addLast(candidates[i]);
            dfs(candidates, sum+candidates[i], i, target, res, path, len);
            path.removeLast();
        }
    }
}
