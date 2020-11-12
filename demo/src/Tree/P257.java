package Tree;

import java.util.*;

public class P257 {
    public static void main(String[] args) {

    }
    // 深度优先遍历
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs(root, "", res);
        return res;
    }
    public void dfs(TreeNode root, String path, List<String> res){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            res.add(path + root.val);
            return;
        }
        dfs(root.left, path + root.val + "->", res);
        dfs(root.right, path + root.val + "->", res);
    }
    //广度优先遍历
    public List<String> binaryTreePaths_1(TreeNode root){
        List<String> list = new ArrayList<>();
        dfs_1(root, "", list);
        return list;
    }
    public void dfs_1(TreeNode node, String path, List<String> list){
        if(node == null)
            return;
        if(node.left == null && node.right == null){
            list.add(path + node.val);
            return;
        }
        dfs(node.left, path + node.val + "->" , list);
        dfs(node.right, path + node.val + "->", list);
    }
}
