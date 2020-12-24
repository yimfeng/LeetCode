package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2020-12-24 10:41 上午
 * @desc: 二叉搜索树的最近公共祖先
 */
public class P068_1 {
    public static void main(String[] args) {

    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val > root.val && q.val > root.val)
            return lowestCommonAncestor(root.right, p ,q);
        else if(p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left, p ,q);
        return root;
    }
}
