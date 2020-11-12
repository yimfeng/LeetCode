package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class P230 {
    public static void main(String[] args) {

    }
    // 中序遍历
    List<Integer> list = new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)
            return -1;
        Inorder(root);
        return list.get(k-1);
    }
    public void Inorder(TreeNode root){
        if(root == null)
            return ;
        Inorder(root.left);
        list.add(root.val);
        Inorder(root.right);
    }
    // 使用堆栈进行操作
    public int KthSmallest(TreeNode root,int k){
        if(root == null)
            return -1;
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();

        while(true){
            while(root != null){
                stack.add(root);
                root = root.left;
            }
            root = stack.removeLast();
            if(--k == 0)
                return root.val;
            root = root.right;
        }
    }
}
