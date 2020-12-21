package 剑指offer;

import java.util.*;

/**
 * @author: yimfeng
 * @date: 2020-12-21 6:04 下午
 * @desc:
 */
public class P032_3 {
    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> level = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return level;
        queue.add(root);
        int flag = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            if(flag %2 != 0)
                Collections.reverse(list);
            flag++;
            level.add(list);
        }
        return level;
    }
}
