package Array;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class P046 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(len == 0)
            return res;
        Boolean[] visited = new Boolean[len];
        int depth = 0;
        List<Integer> path = new ArrayList<>();
        dfs(nums, len, depth, visited, path, res);
        return res;
    }
    private void dfs(int[] nums, int len ,int depth, Boolean[] visited, List<Integer> path, List<List<Integer>> res){
        if(depth == len){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if(visited[i] == false){
                path.add(nums[i]);
                visited[i] = true;
                dfs(nums, len, depth + 1, visited, path, res);

                visited[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}