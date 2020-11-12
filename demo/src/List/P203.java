package List;

public class P203 {
    public static void main(String[] args) {

    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode cummy = new ListNode(0);
        cummy.next = head;
        ListNode prev = cummy, curr = head;
        while (curr != null) {
            if (curr.val == val)
                prev.next = curr.next;
            else
                prev = curr;
            curr = curr.next;
        }
        return cummy.next;
    }
}
