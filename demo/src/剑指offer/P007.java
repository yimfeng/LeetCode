package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2020-12-21 10:32 上午
 * @desc:
 */
public class P007 {
    public static void main(String[] args) {

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = preorder.length;
        return bulidTree(0, len, preorder, 0, len, inorder);
    }

    private TreeNode bulidTree(int p_start, int p_end, int[] preorder, int i_start, int i_end, int[] inorder){
        if(p_start == p_end)
            return null;
        int index = 0;
        int root_val = preorder[p_start];
        TreeNode root = new TreeNode(root_val);
        for (int i = i_start; i < i_end; i++) {
            if(inorder[i] == preorder[p_start])
                index = i;
                break;
        }
        int leftNum = index - i_start;
        root.left = bulidTree(p_start+1, p_start+leftNum+1, preorder, i_start, index, inorder);
        root.right = bulidTree(p_start+leftNum+1, p_end, preorder, index+1, i_end,inorder);
        return root;
    }
}
