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
        Deque<Integer> path = new ArrayDeque<>();
        boolean[] visit = new boolean[len+1];
        dfs(nums, res, path, visit, len);
        return res;
    }
    private void dfs(int[] nums, List<List<Integer>> res, Deque<Integer> path, boolean[] visit, int len){
        if(path.size() == len){
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < len; i++) {
            if(visit[i] == false){
                path.addLast(nums[i]);
                visit[i] = true;
                dfs(nums, res, path, visit, len);
                visit[i] = false;
                path.removeLast();
            }
        }
    }
}
