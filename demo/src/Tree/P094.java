package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P094 {
    public static void main(String[] args) {

    }
    // 递归方法
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        InOrder(root, list);
        return list;
    }
    private void InOrder(TreeNode root, List<Integer> list){
        if(root == null)
            return;
        InOrder(root.left, list);
        list.add(root.val);
        InOrder(root.right, list);
    }

    //迭代方法
    class ColorNode {
        TreeNode node;
        String color;

        public ColorNode(TreeNode node,String color){
            this.node = node;
            this.color = color;
        }
    }
    public List<Integer> inorderTraversal1(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return list;
        Stack<ColorNode> stack = new Stack<>();
        stack.push(new ColorNode(root, "white"));

        while(!stack.isEmpty()){
            ColorNode cn = stack.pop();
            if(cn.color.equals("white")){
                if(cn.node.right != null) stack.push(new ColorNode(cn.node.right,"white"));
                stack.push(new ColorNode(cn.node,"gray"));
                if(cn.node.left != null)stack.push(new ColorNode(cn.node.left,"white"));
            }
            else
                list.add(cn.node.val);
        }
        return list;
    }
}
