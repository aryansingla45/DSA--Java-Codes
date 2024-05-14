package LinkedList;

/*Given the head of a linked list, remove the nth node from the end of the list and return its head.*/

public class Ques19 {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
    }
    public static void main(String[] args) {
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(6);
        ListNode n3 = new ListNode(7);
        ListNode n4 = new ListNode(8);
        ListNode n5 = new ListNode(9);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ListNode ans = RemoveNthNodeFromEnd(n1 , 3);
        display(n1);
        System.out.println(ans);
    }

    // Return the deleted Node.(Finding)
    private static ListNode nthNodeFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int indexToRemove = size - n + 1;
        temp = head;
        for(int i = 1; i < indexToRemove; i++){
            temp = temp.next;
        }
        return temp;
    }

    // Return the List after Deleting the Node.(Removing)
    private static ListNode RemoveNthNodeFromEnd(ListNode head , int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 0; i <= n; i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void display(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

}
