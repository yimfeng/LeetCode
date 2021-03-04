package List;

import java.util.Stack;

/**
 * @author: yimfeng
 * @date: 2021-03-02 2:47 下午
 * @desc:
 */
public class P025 {
    public static void main(String[] args) {

    }
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1)
            return head;
        Stack<ListNode> stack = new Stack<>();
        int len = getlen(head);
        int num = len/k;
        ListNode p = new ListNode(0);
        ListNode cur = head;
        head = p;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < k; j++) {
                stack.add(cur);
                cur = cur.next;
            }
            while(!stack.isEmpty()){
                p.next = stack.pop();
                p = p.next;
            }
        }
        if(cur != null)
            p.next = cur;
        else
            p.next = null;
        return head.next;
    }
    private int getlen(ListNode head){
        int len = 1;
        while(head != null){
            head = head.next;
            len++;
        }
        return len;
    }
}
