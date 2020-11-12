package List;

public class P206 {
    public static void main(String[] args) {

    }
    // 双指针方法，设置两个指针
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;  // 初始化prev为null
        ListNode curr = head;  // 初始化curr为head
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
