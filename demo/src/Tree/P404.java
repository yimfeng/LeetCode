package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class P404 {
    public static void main(String[] args) {

    }
    // 深度优先
    int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0;
        if(root.left != null){
            if(root.left.left == null && root.left.right == null)
                sum = sum + root.left.val;
            sumOfLeftLeaves(root.left);
        }
        sumOfLeftLeaves(root.right);
        return sum;
    }

    // 广度优先
    public int sumOfLeftLeaves1(TreeNode root){
        int sum = 0;
        if(root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node.left != null) {
                if (node.left.left == null && node.left.right == null)
                    sum = sum + node.left.val;
                queue.add(node.left);
            }
            if(node.right != null)
                queue.add(node.right);
        }
        return sum;
    }
}
