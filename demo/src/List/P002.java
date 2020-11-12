package List;

public class P002 {
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode prev = new ListNode();
        ListNode curr = prev;
        int carry = 0;
        while(l1 != null || l2 != null){
            int num1 = l1 == null ? 0 : l1.val;
            int num2 = l2 == null ? 0 : l2.val;
            int sum = num1 + num2 + carry;
            carry = sum / 10;
            sum = sum % 10;
            curr.next = new ListNode(sum);
            curr = curr.next;
            if(l1 != null)
                l1 = l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if(carry == 1)
            curr.next = new ListNode(carry);
        return prev.next;
    }
}
