package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2020-12-24 10:53 上午
 * @desc: 二叉树的最近公共祖先
 */
public class P068_2 {
    public static void main(String[] args) {

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)
            return root;
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null && right == null)
            return null;
        if(left == null)
            return right;
        if(right == null)
            return left;
        return root;
    }
}
