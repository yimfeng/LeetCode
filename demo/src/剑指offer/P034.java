package 剑指offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author: yimfeng
 * @date: 2020-12-21 6:58 下午
 * @desc:
 */
public class P034 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> level = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        if(root == null)
            return level;
        dfs(path, level, root, sum);
        return level;
    }
    public void dfs(Deque<Integer> path, List<List<Integer>> level, TreeNode root, int sum){
        if(root == null)
            return;
        path.offerLast(root.val);
        sum = sum - root.val;
        if(sum == 0 && root.left == null && root.right == null)
            level.add(new ArrayList<>(path));
        dfs(path, level, root.left, sum);
        dfs(path, level, root.right, sum);
        path.removeLast();
    }
}
