package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2020-12-21 8:03 下午
 * @desc:
 */
public class P024 {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        ListNode p = head;
        ListNode ls = new ListNode(0);
        ls.next = null;
        ListNode st = ls;
        while(p != null){
            ListNode q = p.next;
            q.next = ls.next;
            ls.next = q;
            p = p.next;
        }
        return st.next;
    }
}
