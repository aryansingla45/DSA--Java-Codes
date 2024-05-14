package LinkedList;

// Merge two sorted linked list

public class Ques21 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public static int length(ListNode h){
        int count = 0;
        while(h != null){
            count++;
            h = h.next;
        }
        return count;
    }

    public static ListNode sortll(ListNode list1 , ListNode list2){
        ListNode head = new ListNode(0);
        ListNode dummy = head;
        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                ListNode temp = new ListNode(list1.val);
                dummy.next = temp;
                dummy = temp;
                list1 = list1.next;
            } else {
                ListNode temp = new ListNode(list2.val);
                dummy.next = temp;
                dummy = temp;
                list2 = list2.next;
            }
        }
        dummy.next = (list1 != null)? list1 : list2;
        return head.next;
    }
    public static void main(String[] args) {
        //solved
    }
}
