package Recall;

import java.util.*;

/**
 * @author: yimfeng
 * @date: 2021-01-31 9:41 上午
 * @desc:
 */
public class P040 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        int len = candidates.length;
        if(len == 0)
            return res;
        Deque<Integer> path = new ArrayDeque<>();
        dfs(candidates, target, 0, 0, path, res);
        return res;
    }
    private void dfs(int[] candidates, int target, int index, int sum, Deque<Integer> path, List<List<Integer>> res){
        if(sum > target)
            return ;
        if(sum == target){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if(sum + candidates[i] > target)
                break;
            if(i > index && candidates[i] == candidates[i-1])
                continue;
            path.addLast(candidates[i]);
            dfs(candidates, target, index+1, sum+candidates[i], path, res);
            path.removeLast();
        }
    }
}
