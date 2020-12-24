package 剑指offer;

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: yimfeng
 * @date: 2020-12-24 9:42 上午
 * @desc: 二叉树的深度
 */
public class P055_1 {
    public static void main(String[] args) {

    }
    // 层序遍历
    public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while(queue.size() != 0){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            depth++;
        }
        return depth;
    }

    // 先序遍历
    int maxdepth = 0;
    public int maxDepth_1(TreeNode root) {
        int depth = 1;
        dfs(root, depth);
        return maxdepth;
    }
    private void dfs(TreeNode root, int depth){
        if(root == null)
            return ;
        if(root.left == null && root.right == null)
            maxdepth = Math.max(maxdepth, depth);
        dfs(root.left, depth+1);
        dfs(root.right, depth+1);
    }
}
