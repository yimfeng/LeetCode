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
    // 双指针方法
    public ListNode reverseList_1(ListNode head) {
        ListNode prev = head;
        ListNode curr = null;
        while(prev != null){
            ListNode temp = prev.next;
            prev.next = curr;
            curr = prev;
            prev = temp;
        }
        return curr;
    }
    // 递归方法
    public ListNode reverseList_2(ListNode head){
        if(head == null || head.next == null)
            return head;
        ListNode curr = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return curr;
    }
}
