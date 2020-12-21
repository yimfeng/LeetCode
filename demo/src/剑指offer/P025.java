package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2020-12-21 6:28 下午
 * @desc: 合并两个排序的链表
 */
public class P025 {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(0);
        ListNode q = p;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                p.next = l1;
                l1 = l1.next;
            }else{
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        p.next = l1 != null ? l1 : l2;
        return q.next;
    }
}
