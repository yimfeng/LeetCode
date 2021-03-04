package Array;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class P077 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        if(n == 0)
            return res;
        Deque<Integer> path = new ArrayDeque<>();
        //boolean[] visit = new boolean[n+1];
        dfs(n, k, 1, res, path);
        return res;
    }
    private void dfs(int n, int k, int start, List<List<Integer>> res, Deque<Integer> path){
        if(path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = start; i <= n - (k - path.size()) + 1; i++) {
            path.addLast(i);
            dfs(n, k, i+1, res, path);
            path.removeLast();
        }
    }
}
