package List;

public class P203 {
    public static void main(String[] args) {

    }
    public ListNode removeElements(ListNode head, int val) {
        ListNode cummy = new ListNode(0);
        cummy.next = head;
        ListNode curr = head, prev = cummy;
        while(curr != null){
            if(curr.val == val)
                curr = curr.next;
            prev = curr;
            curr = curr.next;
        }
        return cummy.next;
    }
}
