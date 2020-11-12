package Tree;

import java.util.ArrayList;
import java.util.List;

public class P783 {
    public static void main(String[] args) {

    }
    // 递归实现
    List<Integer> list = new ArrayList<>();
    public int minDiffInBST(TreeNode root){
        if (root == null)
            return 0;
        Inorder(root);
        int mymin = list.get(0);
        for(int i = 1; i < list.size(); i++){
            int temp = list.get(i) - list.get(i-1);
            if(temp < mymin)
                mymin = temp;
        }
        return mymin;
    }
    public void Inorder(TreeNode root){
        if(root == null)
            return;
        Inorder(root.left);
        list.add(root.val);
        Inorder(root.right);
    }
    // 迭代实现

}
