package Array;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author: yimfeng
 * @date: 2021-02-18 10:01 上午
 * @desc: 组合总和 III
 */
public class P216 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        if(k == 0)
            return res;
        Deque<Integer> path = new ArrayDeque<>();
        boolean[] visit = new boolean[10];
        dfs(k, n, 0, 1, visit, path, res);
        return res;
    }
    private void dfs(int k, int n, int sum, int start, boolean[] visit, Deque<Integer> path, List<List<Integer>> res){
        if(sum == n && path.size() == k){
            res.add(new ArrayList<>(path));
        }
        for (int i = start; i < 9; i++) {
            if(sum > n || path.size() == k)
                break;
            if(visit[i] == false){
                visit[i] = true;
                path.addLast(i);
                dfs(k, n, sum+i, i+1, visit, path, res);
                visit[i] = false;
                path.removeLast();
            }
        }
    }
}
