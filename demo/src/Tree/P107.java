package Tree;

import java.util.*;

public class P107 {
    public static void main(String[] args) {

    }
    List<List<Integer>> ret = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null)
            return ret;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int level = queue.size();
            for(int i=0; i<level; i++){
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            ret.add(list);
        }
        Collections.reverse(ret);
        return ret;
    }
}
