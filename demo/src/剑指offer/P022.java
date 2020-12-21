package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2020-12-21 6:23 下午
 * @desc: 剑指 Offer 22. 链表中倒数第k个节点
 */
public class P022 {
    public static void main(String[] args) {

    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p = head;
        ListNode q = head;
        int num = k;
        while(num != 0){
            q = q.next;
            num--;
        }
        while(q != null){
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
