package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class P112 {
    public static void main(String[] args) {

    }
    // 递归方法
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(root.left == null && root.right == null){
            return sum == root.val;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
    }
    // 广度优先算法
    public boolean hasPathSum1(TreeNode root, int sum){
        if(root == null)
            return false;
        Queue<TreeNode> quenode = new LinkedList<>();
        Queue<Integer> queval = new LinkedList<>();
        quenode.add(root);
        queval.add(root.val);
        while(!quenode.isEmpty()){
            TreeNode node = quenode.poll();
            int temp = queval.poll();
            if(node.left == null && node.right == null){
                if(temp == sum)
                    return true;
                continue;
            }
            if(node.left != null){
                quenode.add(node.left);
                queval.add(temp + node.left.val);
            }
            if(node.right != null){
                quenode.add(node.right);
                queval.add(temp + node.right.val);
            }
        }
        return false;
    }
}
