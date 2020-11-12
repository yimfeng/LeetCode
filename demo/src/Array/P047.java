package Array;

import java.util.*;

public class P047 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(len == 0)
            return res;
        Arrays.sort(nums);
        boolean[] visited = new boolean[len];
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums, len,  0, visited, path, res);
        return res;
    }
    private void dfs(int[] nums, int len, int depth, boolean[] visited, Deque<Integer> path, List<List<Integer>> res){

        if(depth == len){
            res.add(new ArrayList<>(path));
            return;
        }

        for(int i=0; i<len; i++){
            if(visited[i] == true)
                continue;

            if(i > 0 && nums[i] != nums[i-1] && !visited[i-1])
                continue;

            path.addLast(nums[i]);
            visited[i] = true;

            dfs(nums, len, depth + 1,  visited, path, res);

            visited[i] = false;
            path.removeLast();
        }
    }
}
