package Tree;

import java.util.ArrayList;
import java.util.List;

public class P098 {
    public static void main(String[] args) {

    }
    List<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        Inorder(root);
        for(int i=1; i<list.size(); i++){
            if(list.get(i) <= list.get(i-1))
                return false;
        }
        return true;
    }
    public void Inorder(TreeNode root){
        if(root == null)
            return;
        Inorder(root.left);
        list.add(root.val);
        Inorder(root.right);
    }
}
