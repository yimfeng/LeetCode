package List;

public class P061 {
    public static void main(String[] args) {

    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        ListNode node = head;
        int len = 1;
        while(head.next != null){
            head = head.next;
            len++;
        }
        head.next = node;

        k = k % len;
        int start = 1;
        if(k == 0)
            return head;

        head = head.next;
        while(start != len - k){
            head = head.next;
            start++;
        }
        head = node.next;
        node.next = null;
        ListNode p = head.next;
        head.next = null;
        return p;
    }
}
