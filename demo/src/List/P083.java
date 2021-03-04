package List;

import java.util.HashMap;
import java.util.Map;

public class P083 {
    public static void main(String[] args) {

    }
    // 此时没有用到排序这个条件
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer, Integer> map = new HashMap<>();
        if(head == null)
            return head;
        ListNode node = new ListNode(0);
        node.next = head;
        while(node != null && node.next != null){
            int value = node.next.val;
            if(map.containsKey(value)){
                node.next = node.next.next;
            }
            map.put(value, 1);
            node = node.next;
        }
        return head;
    }

    // 使用排序这个条件之后
    public ListNode deleteDuplicates_1(ListNode head){
        if(head == null)
            return head;
        ListNode cur = head;
        while(cur != null && cur.next != null){
            if(cur.next.val == cur.val)
                cur.next = cur.next.next;
            else
                cur = cur.next;
        }
        return head;
    }
}
