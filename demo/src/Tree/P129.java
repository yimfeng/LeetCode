package Tree;

import java.util.*;

public class P129 {
    public static void main(String[] args) {

    }
    // 使用广度优先遍历
    Map<TreeNode, TreeNode> map = new HashMap<>();
    public int sumNumbers(TreeNode root) {
        int count = 0;
        if (root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left == null && node.right == null) {
                count = count + CountSum(node);
            }
            if (node.left != null) {
                map.put(node.left, node);
                queue.add(node.left);
            }
            if (node.right != null) {
                map.put(node.right, node);
                queue.add(node.right);
            }
        }
        return count;
    }
    public int CountSum(TreeNode node) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = map.get(node);
        }
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            sum = sum * 10 + temp;
        }
        return sum;
    }

    // 使用深度优先遍历
    public int CountSum_1(TreeNode root){
        return dfs(root, 0);
    }
    public int dfs(TreeNode node, int sum){
        if(node == null)
            return 0;
        sum = sum + node.val * 10;
        if(node.left == null && node.right == null){
            return sum;
        }
        return dfs(node.left, sum) + dfs(node.right, sum);
    }
}
