package List;

/**
 * @author: yimfeng
 * @date: 2021-03-05 10:14 上午
 * @desc: 反转链表II
 */
public class P092 {
    public static void main(String[] args) {

    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right || head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = head;
        ListNode curr = null;
        ListNode newHead = head;
        ListNode end = dummy;
        int start = 1, num = 0;
        for (int i = 0; i < right && end != null; i++) {
            end = end.next;
        }
        ListNode next = end.next;
        while(start < left && prev != null){
            newHead = prev;
            prev = prev.next;
            start++;
        }
        ListNode pre = prev;
        // 进行反转
        while(num <= right - left && prev != null){
            num++;
            ListNode temp = prev.next;
            prev.next = curr;
            curr = prev;
            prev = temp;
        }
        // 将之前newhead指向curr
        newHead.next = curr;

        // 将之前的pre指向next
        pre.next = next;

        return dummy.next;
    }
}
