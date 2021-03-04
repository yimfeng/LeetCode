package Tree;

/**
 * @author: yimfeng
 * @date: 2021-02-04 8:24 下午
 * @desc: 从中序与后序遍历序列构造二叉树
 */
public class P106 {
    public static void main(String[] args) {

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length;
        return build(0, len-1, inorder, 0, len-1, postorder);
    }
    private TreeNode build(int i_start, int i_end, int[] inorder, int p_start, int p_end, int[] postorder){
        if(p_start == p_end)
            return null;
        int root_val = postorder[p_end];
        TreeNode root = new TreeNode(root_val);
        int i_root_index = i_start;
        for(int i = i_start; i < i_end; i++){
            if(inorder[i] == postorder[p_end]){
                i_root_index = i;
                break;
            }
        }
        root.left = build(i_start, i_root_index-1, inorder, p_start, p_start+i_root_index-i_start-1, postorder);
        root.right = build(i_root_index+1, i_end, inorder, p_end + i_root_index - i_start, p_end-1, postorder);
        return root;
    }
}
