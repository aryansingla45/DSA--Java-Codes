package LinkedList;
/*You are given the head of a linked list. Delete the middle node, and return the head of the modified linked
 list.
The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing,
 where ⌊x⌋ denotes the largest integer less than or equal to x.*/

public class Ques2095 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }

    public ListNode deleteMiddle(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
        for(int i = 1; i < size / 2; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
    public static void main(String[] args) {
        //Not implemented here. go on leetcode.

    }
}
