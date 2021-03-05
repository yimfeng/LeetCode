package List;

/**
 * @author: yimfeng
 * @date: 2021-03-05 12:51 下午
 * @desc:
 */
public class P086 {
    public static void main(String[] args) {

    }
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode smallHead = small;
        ListNode large = new ListNode(0);
        ListNode largeHead = large;
        while (head != null){
            if(head.val < x){
                small.next = head;
                small = small.next;
            } else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        large.next = null;
        small.next = largeHead.next;
        return smallHead.next;
    }
}
