package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P199 {
    public static void main(String[] args) {

    }
    // 使用广度优先遍历
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            for (int i=0; i<level; i++){
                TreeNode node = queue.poll();
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
                if(i == level -1)
                    list.add(node.val);
            }
        }
        return list;
    }

}
