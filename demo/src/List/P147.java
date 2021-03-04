package List;

/**
 * @author: yimfeng
 * @date: 2021-02-28 5:05 下午
 * @desc:
 */
public class P147 {
    public static void main(String[] args) {

    }
    public ListNode insertionSortList(ListNode head) {
       if(head == null)
           return head;
       ListNode dummyHead = new ListNode(0);
       dummyHead.next = head;
       ListNode lastSorted = head, curr = head.next;
       while(curr != null){
           if(curr.val > lastSorted.val)
               lastSorted = curr;
           else{
               ListNode prev = dummyHead;
               while(prev.next.val < curr.val){
                   prev = prev.next;
               }
               lastSorted.next = curr.next;
               curr.next = prev.next;
               prev.next = curr;
           }
           curr = lastSorted.next;
       }
       return dummyHead.next;
    }
}
