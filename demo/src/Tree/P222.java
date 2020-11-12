package Tree;

public class P222 {
    public static void main(String[] args) {

    }
    int sum = 0;
    public int countNodes(TreeNode root) {
        if(root == null)
            return sum;
        sum = sum + 1;
        countNodes(root.left);
        countNodes(root.right);
        return sum;
    }
}
