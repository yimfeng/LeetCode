package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P337 {
    public static void main(String[] args) {

    }
    public int rob(TreeNode root) {
        if(root == null)
            return 0;
        int money = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            int levelsum = 0;
            for(int i=0; i<level; i++) {
                TreeNode node = queue.poll();
                levelsum = levelsum + node.val;
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            list.add(levelsum);
        }
        int len = list.size();
        return max_sum(list, len);
    }
    private int max_sum(List<Integer> list, int len){
        if(len == 0)
            return 0;
        if(len == 1)
            return list.get(1);
        int[] dp = new int[len];
        dp[0] = list.get(0);
        dp[1] = Math.max(list.get(1), list.get(0));
        for(int i=2; i<len; i++){
            dp[i] = Math.max(dp[i-2] + list.get(i), dp[i-1]);
        }
        return dp[len - 1];
    }
}
