package LinkedList;
//leetcode 237
/*There is a singly-linked list head, and we want to delete a node in it.
You are given the node to be deleted node. You will not be given access to the first node of head.
All the values of the linked list are unique, and it is guaranteed that the given node is
not the last node in the linked list.

Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:
The value of the given node should not exist in the linked list.
The number of nodes in the linked list should decrease by one.
All the values before node should be in the same order.
All the values after node should be in the same order.

Custom testing:
For the input, you should provide the entire linked list head and the node to be given node.
node should not be the last node of the list and should be an actual node in the list.
We will build the linked list and pass the node to your function.
The output will be the entire list after calling your function.*/


public class Ques237{
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
    }
    public static void display(ListNode head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void deleteNode(ListNode node){
        node.val = node.next.val;
        node.next = node.next.next;
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
        display(n1);
        deleteNode(n3);
        display(n1);
    }
}
