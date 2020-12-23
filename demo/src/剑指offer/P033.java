package 剑指offer;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author: yimfeng
 * @date: 2020-12-22 1:08 下午
 * @desc:
 */
public class P033 {
    public static void main(String[] args) {

    }
    // 自己写的方法
    public boolean verifyPostorder(int[] postorder) {
        int len = postorder.length;
        int[] inorder = new int[len];
        inorder = postorder;
        Arrays.sort(inorder);
        return judge(inorder, 0, len, postorder, 0, len);
    }

    private boolean judge(int[] inorder, int i_start, int i_end, int[] postorder, int p_start, int p_end){
        if(p_start == p_end)
            return true;
        int index = 0;
        for (int i = i_start; i < i_end; i++) {
            if(inorder[i] == postorder[p_end]) {
                index = i;
                break;
            }
        }
        int leftNum = index - i_start;
        for (int i = p_start; i < p_start + leftNum + 1; i++) {
            if(postorder[i] > postorder[p_end])
                return false;
        }
        for (int i = p_start + leftNum +1; i < p_end; i++) {
            if(postorder[i] < postorder[p_end])
                return false;
        }
        judge(inorder, i_start, index, postorder, p_start, p_start + leftNum + 1);
        judge(inorder, index + 1, p_end, postorder, p_start + leftNum + 1, p_end - 1);
        return true;
    }
    // LeetCode上的方法
    public boolean verifyPostorder_1(int[] postorder){
        return Judge(postorder, 0, postorder.length - 1);
    }
    private boolean Judge(int[] postorder, int left, int right){
        if(left > right)
            return true;
        int mid = left;
        int root = postorder[right];
        while(postorder[mid] < root)
            mid++;
        int temp = mid;
        while(temp < right){
            if(postorder[temp++] < root)
                return false;
        }
        return Judge(postorder, left, mid - 1) && Judge(postorder, mid, right -1);
    }
}
