package Recall;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author: yimfeng
 * @date: 2021-01-30 7:57 下午
 * @desc:
 */
public class P039 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        int len = candidates.length;
        if(len == 0)
            return res;
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates, target, 0, 0, len, path, res);
        return res;
    }
    private void dfs(int[] candidates, int target, int sum, int index, int len, Deque<Integer> path, List<List<Integer>> res){
        if(sum == target){
            res.add(new ArrayList<>(path));
            return;
        }
        if(sum > target)
            return;
        for (int i = index; i < len; i++) {
            if(sum + candidates[i] > target)
                break;
            path.addLast(candidates[i]);
            dfs(candidates, target, sum + candidates[i], i, len, path, res);
            path.removeLast();
        }
    }
}
