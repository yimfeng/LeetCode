package List;

import java.util.LinkedList;
import java.util.Stack;

public class P234 {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(ListNode head){
        if(head == null || head.next == null)
            return true;
        LinkedList<String> list = new LinkedList<>();
        ListNode prev = head;
        while(prev != null){
            list.add(Integer.toString(prev.val + 1));
            prev = prev.next;
        }
        return judge(list);
    }
    private boolean judge(LinkedList<String> list){
        int len = list.size();
        for(int i=0; i<len/2; i++){
            if(list.get(i).compareTo(list.get(len - i - 1)) != 0)
                return false;
        }
        return true;
    }
}
