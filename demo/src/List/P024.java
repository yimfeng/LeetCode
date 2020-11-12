package List;

import java.util.Stack;

public class P024 {
    public static void main(String[] args) {

    }
    // 使用栈进行
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode p = new ListNode(-1);
        ListNode cur = head;
        head = p;
        while(cur != null && cur.next != null){
            stack.add(cur);
            stack.add(cur.next);
            cur = cur.next.next;
            p.next = stack.pop();
            p = p.next;
            p.next = stack.pop();
            p = p.next;
        }
        if(cur != null)
            p.next = cur;
        else
            p.next = null;
        return head.next;
    }
}
