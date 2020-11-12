package Tree;

import List.ListNode;

import java.util.ArrayList;
import java.util.List;

public class P114 {
    public static void main(String[] args) {

    }
    // 前序遍历
    public void flatten(TreeNode root) {
        List<TreeNode> list = new ArrayList<>();
        PreOrder(root, list);
        int size = list.size();
        for(int i=1; i<size; i++){
            TreeNode prev = list.get(i-1), curr = list.get(i);
            prev.left = null;
            prev.right = curr;
        }
    }
    public void PreOrder(TreeNode root, List<TreeNode> list){
        if(root == null)
            return;
        list.add(root);
        PreOrder(root.left, list);
        PreOrder(root.right, list);
    }

    //前序遍历和展开同步进行

}
