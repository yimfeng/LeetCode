package Recall;

import javax.imageio.plugins.tiff.FaxTIFFTagSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author: yimfeng
 * @date: 2021-01-31 10:08 上午
 * @desc:
 */
public class P046 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if(len == 0)
            return res;
        boolean[] visit = new boolean[len];
        for (int i = 0; i < len; i++) {
            visit[i] = false;
        }
        int depth = 0;
        Deque<Integer> path = new ArrayDeque<>();
        dfs(nums, visit, depth, path, res);
        return res;
    }
    private void dfs(int[] nums, boolean[] visit, int depth, Deque<Integer> path, List<List<Integer>> res){
        if(depth == nums.length)
            res.add(new ArrayList<>(path));
        for (int i = 0; i < nums.length; i++) {
            if(visit[i] == false){
                path.addLast(nums[i]);
                visit[i] = true;
                dfs(nums, visit, depth+1, path, res);
                visit[i] = false;
                path.removeLast();
            }
        }
    }
}
