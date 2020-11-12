package List;

public class P160 {
    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = getLength(headA);
        int len2 = getLength(headB);
        int len = len1 > len2 ? len1 - len2 : len2 - len1;
        if(len1 > len2){
            for(int i=0; i<len; i++)
                headA = headA.next;
        }
        if(len1 < len2){
            for(int i=0; i<len; i++)
                headB = headB.next;
        }
        while(headA != null && headB != null){
            if(headA == headB)
                return headA;
            headA = headA.next;
            headB = headB.next;
        }
        return null;
    }
    public int getLength(ListNode head){
        int length = 0;
        while(head != null){
            head = head.next;
            length++;
        }
        return length;
    }
}
