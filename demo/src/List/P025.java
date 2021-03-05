package List;

import java.beans.beancontext.BeanContext;
import java.util.Stack;

/**
 * @author: yimfeng
 * @date: 2021-03-02 2:47 下午
 * @desc:
 */
public class P025 {
    public static void main(String[] args) {

    }
    // 自己写的用栈来进行
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


    public ListNode reverseKGroup_1(ListNode head, int k){
        if(head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode end = dummy;
        while(end != null){
            for (int i = 0; i < k && end != null; i++) {
                end = end.next;
            }
            if(end == null)
                break;
            ListNode next = end.next;
            end.next = null;
            ListNode start = pre.next;
            reverse(start);
            start.next = next;
            pre = start;
            end = start;
        }
        return dummy.next;
    }

    private ListNode reverse(ListNode head){
        if(head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
