package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2020-12-23 11:18 上午
 * @desc: 删除链表的节点
 */
public class P018 {
    public static void main(String[] args) {

    }
    public ListNode deleteNode(ListNode head, int val) {
        ListNode p = null;
        ListNode q = head;
        if(head.val == val)
            q = head.next;
        else{
            while(head.next != null){
                p = head;
                head = head.next;
                if(head.val == val){
                    p.next = head.next;
                    if(head.next != null)
                        head = head.next;
                    else
                        head.next = null;
                }
            }
        }
        return q;
    }
}
