package List;

public class P061 {
    public static void main(String[] args) {

    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return null;
        int len = getlen(head);
        if(k % len == 0)
            return head;
        if(k >= len)
            k = k % len;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        ListNode fin = curr;
        int num = 0;
        while(len - k - num != 0){
            curr = curr.next;
            num ++;
        }
        while(curr.next != null){
            curr = curr.next;
        }
        if(curr.next == null){
            while(k != 0){
                curr.next = prev;
                curr = curr.next;
                prev = prev.next;
                k--;
            }
        }
        curr.next = null;
        return fin;
    }
    public int getlen(ListNode head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }
}
