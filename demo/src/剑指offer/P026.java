package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2020-12-24 11:43 上午
 * @desc:
 */
public class P026 {
    public static void main(String[] args) {

    }
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return ((A != null && B != null) && (cur(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B)));
    }
    private boolean cur(TreeNode A, TreeNode B){
        if(B == null)
            return true;
        if(A == null || A.val != B.val)
            return false;
        return cur(A.left, B.left) && cur(A.right, B.right);
    }
}
