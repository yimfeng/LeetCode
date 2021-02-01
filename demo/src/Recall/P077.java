package Recall;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author: yimfeng
 * @date: 2021-01-30 8:18 下午
 * @desc:
 */
public class P077 {
    public static void main(String[] args) {

    }
    // 正常版本的递归
    public List<List<Integer>> combine(int n, int k){
        List<List<Integer>> res = new ArrayList<>();
        if(k == 0)
            return res;
        Deque<Integer> path = new ArrayDeque<>();
        dfs(n, k, 1, path, res);
        return res;
    }
    private void dfs(int n, int k, int start, Deque<Integer> path, List<List<Integer>> res){
        if(path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i <= n - (k - path.size()) + 1; i++) {
            path.addLast(i);
            dfs(n, k, i+1, path, res);
            path.removeLast();
        }
    }
}
