package List;

import org.w3c.dom.ls.LSException;

import java.util.LinkedList;

public class P019 {
    public static void main(String[] args) {

    }
    // 使用双链表结点进行遍历
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        ListNode q = head;
        if(p.next == null)
            return null;
        else {
            while (n != 0) {
                q = q.next;
                n--;
            }
            if(q == null){
                return head.next;
            }
            while (q.next != null) {
                p = p.next;
                q = q.next;
            }
            p.next = p.next.next;
            return head;
        }
    }

    // 使用别人的方法简化代码
    public ListNode removeNthFromEnd_1(ListNode head, int n){
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for(int i=0; i<n; i++)
            first = first.next;
        while(first != null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }
}
