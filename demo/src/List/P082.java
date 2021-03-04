package List;

/**
 * @author: yimfeng
 * @date: 2021-03-01 9:51 上午
 * @desc:
 */
public class P082 {
    public static void main(String[] args) {

    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;

        ListNode prev = dummyNode;
        ListNode cur = prev.next;
        while(cur != null){
            int curRepeatNum = 0;
            ListNode difNode = cur;
            while(difNode != null && difNode.val == cur.val){
                difNode = difNode.next;
                curRepeatNum++;
            }
            if(curRepeatNum > 1)
                prev.next = difNode;
            else
                prev = cur;
            cur = difNode;
        }
        return dummyNode.next;
    }
}
