package 剑指offer;

/**
 * @author: yimfeng
 * @date: 2020-12-23 12:20 下午
 * @desc: 两个链表的第一个公共节点
 */
public class P052 {
    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0;
        int len2 = 0;
        int len = 0;
        ListNode p = headA;
        ListNode q = headB;
        while(headA != null){
            headA = headA.next;
            len1++;
        }
        while(headB != null){
            headB = headB.next;
            len2++;
        }
        while(len1 != len2){
            if(len1 > len2){
                p = p.next;
                len1--;
            }else{
                q = q.next;
                len2--;
            }
        }
        while(p != q){
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
