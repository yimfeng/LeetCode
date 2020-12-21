package Tree;

import java.util.ArrayList;
import java.util.List;

public class P105 {
    public static void main(String[] args) {

    }
    /*
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = new TreeNode(0);
        int len = preorder.length;
        if(len == 0)
            return root;
        return preInorder(0, 0, len-1, root, preorder, inorder);  //求出二叉树的线性表示
    }
    private TreeNode preInorder(int index, int left, int right, TreeNode root, int[] preorder, int[] inorder){
        root.val = preorder[index];
        for (int i = left; i < right; i++) {
            if(inorder[i] == preorder[index]){
                right = i;
                break;
            }
        }
        root.left = preInorder(index + 1, left, right-1, root, preorder, inorder);
        root.right = preInorder(index + 1, right + 1, preorder.length - 1, root, preorder, inorder);
        return root;
    }*/
    public TreeNode bulidTree(int[] preorder, int[] inorder){
        return buildTreeHelper(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode buildTreeHelper(int[] preorder,int p_start, int p_end, int[] inorder, int i_start, int i_end){
        if(p_start == p_end)
            return null;
        int root_val = preorder[p_start];
        TreeNode root = new TreeNode(root_val);
        int i_root_index = 0;
        for (int i = i_start; i < i_end; i++) {
            if(inorder[i] == preorder[p_start])
                i_root_index = i;
                break;
        }
        int leftNum = i_root_index - i_start;
        root.left = buildTreeHelper(preorder, p_start + 1, p_start + leftNum + 1, inorder, i_start, i_root_index);
        root.right = buildTreeHelper(preorder, p_start + leftNum + 1, p_end, inorder, i_root_index + 1, i_end);
        return root;
    }
}
