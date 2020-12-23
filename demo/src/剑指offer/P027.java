package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2020-12-22 9:58 上午
 * @desc:
 */
public class P027 {
    public static void main(String[] args) {

    }
    public TreeNode mirrorTree(TreeNode root) {
        if(root == null)
            return null;
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = temp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
