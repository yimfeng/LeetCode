package 剑指offer;

import java.util.Map;

/**
 * @author: yimfeng
 * @date: 2020-12-24 10:01 上午
 * @desc: 平衡二叉树
 */
public class P055_2 {
    public static void main(String[] args) {

    }
    // 前序遍历 + 判断深度
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }
    public int maxDepth(TreeNode root){
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left),maxDepth(root.right)) + 1;
    }
    // 后序遍历 + 剪枝
    public boolean isBalanced_1(TreeNode root){
        return recur(root) != -1;
    }
    private int recur(TreeNode root){
        if(root == null)
            return 0;
        int left = recur(root.left);
        if(left == -1)
            return -1;
        int right = recur(root.right);
        if(right == -1)
            return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
