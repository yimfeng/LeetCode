package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2020-12-22 8:57 上午
 * @desc:
 */
public class P028 {
    public static void main(String[] args) {

    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return isSymm(root.left, root.right);
    }
    private boolean isSymm(TreeNode left, TreeNode right){
        if(left == null && right == null)
            return true;
        if(left == null || right == null)
            return false;
        if(left.val != right.val)
            return false;
        return isSymm(left.left, right.right) && isSymm(left.right, right.left);
    }
}
