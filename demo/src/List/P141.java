package List;

public class P141 {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        if(head == null && head.next == null)
            return false;
        ListNode quick = head;
        ListNode slow = head;
        while(quick != null && slow != null && quick.next != null && quick.next.next !=null){
            quick = quick.next.next;
            slow = slow.next;
            if(quick == slow)
                return true;
        }
        return false;
    }
}
