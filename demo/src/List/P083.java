package List;

public class P083 {
    public static void main(String[] args) {

    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return null;
        ListNode prev = head;
        ListNode curr = head;
        int mymax = 0;
        while(head != null){
            int temp = head.val;
            if(temp > mymax)
                mymax = temp;
            head = head.next;
        }
        int[] hashTable = new int[mymax+1];
        head = prev;
        while(head != null){
            int temp = head.val;
            hashTable[temp] ++;
            if(hashTable[temp] > 1){
                head.next = head.next.next;
            }
            head = head.next;
        }
        return prev;
    }
}
