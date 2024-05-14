package LinkedList;
/*Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.*/

import java.util.List;
import static LinkedList.Ques160.*;

public class Ques876 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static ListNode middleNode(ListNode head) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
        for(int i = 1; i <= size/2; i++){
            temp = temp.next;
        }
        return temp;
    }
    public static ListNode optimized(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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

        ListNode ans = optimized(n1);
        display(ans);
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
