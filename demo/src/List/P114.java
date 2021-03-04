package List;

import Tree.TreeNode;

/**
 * @author: yimfeng
 * @date: 2021-03-02 3:47 下午
 * @desc:
 */
public class P114 {
    public static void main(String[] args) {

    }
    public void flatten(TreeNode root){
        while(root != null){
            if(root.left == null)
                root = root.right;
            else {
                TreeNode pre = root.left;
                while (pre.right != null) {
                    pre = pre.right;
                }
                pre.right = root.right;

                root.right = root.left;
                root.left = null;
                // 考虑下一个节点
                root = root.right;
            }
        }
    }
}
