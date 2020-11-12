package Tree;

import java.util.ArrayList;
import java.util.List;

public class P501 {
    public static void main(String[] args) {

    }
    List<Integer> list = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        if(root == null)
            return null;
        Inorder(root);
        int len = list.size(),num = 0,max = 0;
        int[] arr = new int[len - 1];
        int[] ans = new int[len - 1];
        for(int i = 0; i < list.size(); i++){
            int temp = list.get(i);
            arr[temp] ++;
        }
        for(int i=0; i<list.get(len-1); i++){
            if(arr[i] > max)
                max = arr[i];
        }
        for(int i=0; i<list.get(len-1); i++){
            if(arr[i] == max)
                ans[num ++] = arr[i];
        }
        return ans;
    }
    public void Inorder(TreeNode root){
        if(root == null)
            return;
        Inorder(root.left);
        list.add(root.val);
        Inorder(root.right);
    }
}
