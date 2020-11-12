package List;

public class P876 {
    public static void main(String[] args) {

    }
    public ListNode middleNode(ListNode head) {
        if(head == null)
            return null;
        ListNode first = head;
        ListNode seconde = head;
        while(seconde != null && seconde.next != null && seconde.next.next != null){
            first = first.next;
            seconde = seconde.next.next;
        }
        if(seconde.next == null)
            return first;
        else
            return first.next;
    }
}
