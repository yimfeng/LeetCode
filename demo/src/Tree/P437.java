package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class P437 {
    public static void main(String[] args) {

    }
    // 递归方法，将每个结点都作为根结点
    public int pathSum(TreeNode root, int sum) {
        if(root == null)
            return 0;
        return dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }
    public int dfs(TreeNode root, int sum){
        if(root == null)
            return 0;
        sum = sum - root.val;
        return (sum == 0 ? 1 : 0) + dfs(root.left, sum - root.val) + dfs(root.right, sum - root.val);
    }
}
