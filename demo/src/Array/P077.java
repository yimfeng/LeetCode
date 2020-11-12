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
        if(n == 0 || k == 0)
            return res;
        Deque<Integer> path = new ArrayDeque<>();
        boolean[] visited = new boolean[k];
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i+1;
        }
        dfs(n, k, nums, 0, visited, path, res);
        return res;
    }
    private void dfs(int n, int k, int[] nums, int start, boolean[] visited, Deque<Integer> path, List<List<Integer>> res){
        if(path.size() == k){
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < n; i++) {
            if(visited[i] == false){

                visited[i] = true;
                path.addLast(nums[i]);

                dfs(n, k, nums, i+1, visited, path, res);
                // 回溯
                visited[i] = false;
                path.removeLast();
            }
        }
    }
}
