package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2020-12-24 11:18 上午
 * @desc: 二叉搜索树的第k大节点
 */
public class P054 {
    public static void main(String[] args) {

    }
    int ans = 0;
    int index = 0;
    public int kthLargest(TreeNode root, int k) {
        if(root == null)
            return 0;
        dfs(root, k);
        return ans;
    }
    private void dfs(TreeNode root, int k){
        if(root == null)
            return;
        dfs(root.right, k);
        index++;
        if(index == k)
            ans = root.val;
        dfs(root.left, k);
    }
}
