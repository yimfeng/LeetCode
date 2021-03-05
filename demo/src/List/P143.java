package List;

/**
 * @author: yimfeng
 * @date: 2021-03-05 9:23 上午
 * @desc:
 */
public class P143 {
    public static void main(String[] args) {

    }
    public void reorderList(ListNode head) {
        if(head == null)
            return;
        // 使用快慢节点找到中间节点
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && slow.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;

        // 链表反转
        newHead = reverseList(newHead);

        // 链表节点依次连接
        while(newHead != null){
            ListNode temp = newHead.next;
            newHead.next = head.next;
            head.next = newHead;
            head = newHead.next;
            newHead = temp;
        }
    }

    private ListNode reverse(ListNode head){
        if(head == null || head.next == null)
            return head;
        ListNode prev = head;
        ListNode curr = null;
        while(curr != null){
            ListNode temp = prev.next;
            prev.next = curr;
            curr = prev;
            prev = temp;
        }
        return curr;
    }

    private ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode tail = head;
        head = head.next;

        tail.next = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = tail;
            tail = head;
            head = temp;
        }

        return tail;
    }
}
