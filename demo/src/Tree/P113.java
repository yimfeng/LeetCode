package Tree;

import java.util.*;

public class P113 {
    public static void main(String[] args) {

    }
    // 层序遍历
    List<List<Integer>> ret = new ArrayList<>();
    Map<TreeNode, TreeNode> map = new HashMap<TreeNode, TreeNode>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null)
            return ret;
        Queue<TreeNode> quenode = new LinkedList<>();
        Queue<Integer> queval = new LinkedList<>();
        quenode.add(root);
        queval.add(root.val);
        while(!quenode.isEmpty()){
            TreeNode node = quenode.poll();
            int temp = queval.poll();
            if(node.left == null && node.right == null){
                if(temp == sum)
                    getPath(node);
            }
            if(node.left != null){
                map.put(node.left, node);
                quenode.add(node.left);
                queval.add(temp + node.left.val);
            }
            if(node.right != null){
                map.put(node.right, node);
                quenode.add(node.right);
                queval.add(temp + node.right.val);
            }
        }
        return ret;
    }
    public void getPath(TreeNode node){
        List<Integer> list = new ArrayList<>();
        while(node != null){
            list.add(node.val);
            node = map.get(node);
        }
        Collections.reverse(list);
        ret.add(list);
    }

    // 深度优先
    Deque<Integer> path = new ArrayDeque<>();
    public List<List<Integer>> pathSum1(TreeNode root, int sum) {
        dfs(root, sum);
        return ret;
    }
    public void dfs(TreeNode root, int sum){
        if(root == null)
            return;
        path.offerLast(root.val);
        sum = sum - root.val;
        if(root.left == null && root.right == null)
            if(sum == 0){
                ret.add(new LinkedList<Integer>(path));
            }
        dfs(root.left, sum);
        dfs(root.right, sum);
        path.pollLast();
    }
}
