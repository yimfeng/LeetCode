package List;

public class P021 {
    public static void main(String[] args) {

    }
    // 迭代方法
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);
        ListNode prev = prehead;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }
            else{
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l1 : l2;
        return prehead.next;
    }
    // 递归方法
    public ListNode mergeTwoLists_1(ListNode l1, ListNode l2){
        if(l1 == null)
            return l2;
        if(l2 == null)
            return l1;
        if(l1.val <= l2.val){
            mergeTwoLists_1(l1.next, l2);
            return l1;
        }
        else{
            mergeTwoLists_1(l1, l2.next);
            return l2;
        }
    }
}
