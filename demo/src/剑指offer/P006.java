package 剑指offer;
import java.util.Stack;

/**
 * @author: yimfeng
 * @date: 2020-12-21 9:55 上午
 * @desc: 从尾到头打印链表
 */
public class P006 {
    public static void main(String[] args) {

    }
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode pNode = head;
        while(pNode != null){
            stack.push(pNode);
            pNode = pNode.next;
        }
        int size = stack.size();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = stack.pop().val;
        }
        return num;
    }
}
